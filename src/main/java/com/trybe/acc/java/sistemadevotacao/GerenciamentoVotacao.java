package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/** 
 * Classe de gerenciamento da votação.
 **/
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  
  private ArrayList<String> cpfComputado = new ArrayList<String>();
  
  private int totalVotos;
  
  /** 
   * Método que cadastra uma pessoa candidata.
   **/
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean registroDuplicado = false;

    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numero) {
        registroDuplicado = true;
        break;
      }
    } 

    if (!registroDuplicado) {
      PessoaCandidata candidato = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(candidato);
    } else {
      System.out.println("Número pessoa candidata já utilizado!");
    }

  }
  
  /** 
   * Método que registra uma pessoa eleitora.
   **/
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    PessoaEleitora eleitor = new PessoaEleitora(nome, cpf);

    if (!pessoasEleitoras.contains(eleitor)) {
      pessoasEleitoras.add(eleitor); 
    } else {
      System.out.println("Pessoa eleitora já cadastrada!");
    }
  }
  
  /** 
   * Método utilizado para votar.
   **/
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (PessoaEleitora pessoa : pessoasEleitoras) {
      if (cpfComputado.contains(pessoa.getCpf())) {
        System.out.println("Pessoa eleitora já votou!");
        break;
      }
    }
    
    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numeroPessoaCandidata) {
        pessoa.receberVoto();
        cpfComputado.add(cpfPessoaEleitora);
        break;
      }
    } 
  }
  
  public void mostrarResultado() {
    
  }
  
  private double calcularPorcentagemVotos(int indexPessoaCandidata) {
    return 0;
  }
  
}

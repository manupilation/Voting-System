package com.trybe.acc.java.sistemadevotacao;

/** 
 * Classe que representa uma pessoa candidata a eleição.
 **/
public class PessoaCandidata extends Pessoa {
  
  int numero;
  
  int votos = 0;

  /** 
   * Construtor Pessoa Candidata. Precisa de nome e número do candidato.
   **/
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return this.votos;
  }

  public void setVotos() {
    this.votos += 1;
  }
  
  public void receberVoto() {
    setVotos();
  }

}

package com.trybe.acc.java.sistemadevotacao;

/** 
 * Classe PessoaEleitora.
 **/
public class PessoaEleitora extends Pessoa {
  
  private String cpf;

  /** 
   * Construtor pessoa eleitora; Precisa do CPF.
   **/
  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}

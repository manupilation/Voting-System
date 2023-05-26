package com.trybe.acc.java.sistemadevotacao;

import java.util.Objects;

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
  
  /** 
   * Compara o objeto PessoaEleitora com outros eleitores. 
   **/
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    PessoaEleitora other = (PessoaEleitora) obj;

    return Objects.equals(this.nome, other.nome) && Objects.equals(this.cpf, other.cpf);
  }
}

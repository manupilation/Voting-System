package com.trybe.acc.java.sistemadevotacao;

/** 
 * Classe que representa uma pessoa.
 **/
public abstract class Pessoa {

  public Pessoa(String nome) {
    super();
    this.nome = nome;
  }

  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}

package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/** 
 * Classe principal do projeto.
 **/
public class Principal {

  /** 
   * Método que iniciará toda lógica.
   **/
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean candidatosProcess = true;

    boolean eleitoresProcess = false;
    
    boolean votacaoProcess = false;
    
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    
    printMessage("----------- Bem-vindo ao Sistema de Votação -----------\n");
    
    do {      
      printStartPessoaCandidata();
      
      short option = scanner.nextShort();
      
      if (option == 1) {
        printSendNameCandidato();
        
        final String name = scanner.next();
        
        printSendNumberCandidato();
        
        final int numberCandidato = scanner.nextInt();
        
        gerenciamentoVotacao.cadastrarPessoaCandidata(name, numberCandidato);
 
      } else {
        candidatosProcess = false;
        eleitoresProcess = true;
      }

    } while (candidatosProcess);

    printMessage("\n----------- Cadastre as pessoas eleitoras -----------\n");

    do {
      printLoopPessoaEleitora();
      
      short option = scanner.nextShort();
      
      if (option == 1) {
        printSendNamePessoaEleitora();
        
        final String name = scanner.next();
        
        printSendCpfPessoaEleitora();
        
        final String cpf = scanner.next();
        
        gerenciamentoVotacao.cadastrarPessoaEleitora(name, cpf);
        
      } else {
        eleitoresProcess = false;
        votacaoProcess = true;
      }
      
    } while (eleitoresProcess);
    
    printMessage("\n----------- Votação iniciada! -----------\n");
    
    do {
      printLoopVotacao();
      
      short option = scanner.nextShort();
      
      if (option == 1) {
        printSendCpfPessoaEleitora();     
        
        String cpf = scanner.next();
        
        printNumeroPessoaCandidata();
        
        short voto = scanner.nextShort();
        
        gerenciamentoVotacao.votar(cpf, voto);

      } else if (option == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else {
        gerenciamentoVotacao.mostrarResultado();
        votacaoProcess = false;
      }
      
    } while (votacaoProcess);

    scanner.close();
    
  }
  
  
  private static void printMessage(String message) {
    System.out.println(message);
  }
  
  private static void printStartPessoaCandidata() {
    printMessage("Cadastrar pessoa candidata?");
    printMessage("1 - Sim\n"
        + "2 - Não\n"
        + "Entre com o número correspondente à opção desejada:");
  }
  
  private static void printSendNameCandidato() {
    printMessage("Entre com o nome da pessoa candidata:");
  }
  
  private static void printSendNumberCandidato() {
    printMessage("Entre com o número da pessoa candidata:");
  }
  
  private static void printLoopPessoaEleitora() {
    printMessage("Cadastrar pessoa eleitora?");
    printMessage("1 - Sim\n"
        + "2 - Não\n"
        + "Entre com o número correspondente à opção desejada:");
  }
  
  private static void printSendNamePessoaEleitora() {
    printMessage("Entre com o nome da pessoa eleitora:");
  }
  
  private static void printSendCpfPessoaEleitora() {
    printMessage("Entre com o cpf da pessoa eleitora:");
  }
  
  private static void printLoopVotacao() {
    printMessage("Entre com o número correspondente à opção desejada:");
    printMessage("1 - Votar\n"
        + "2 - Resultado Parcial\n"
        + "3 - Finalizar Votação");
  }

  private static void printNumeroPessoaCandidata() {
    printMessage("Entre com o número da pessoa candidata:");
  }

}

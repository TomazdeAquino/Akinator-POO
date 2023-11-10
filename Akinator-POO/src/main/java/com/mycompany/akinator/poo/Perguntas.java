package com.mycompany.akinator.poo;

import java.util.Scanner;

public class Perguntas {
  private String enunciado;
  private String[] alternativas;

  public Perguntas(String enunciado, String[] alternativas) {
    this.enunciado = enunciado;
    this.alternativas = alternativas;
  }

  public String fazerPergunta() {
      System.out.println(this.enunciado);
      for (int i = 0; i < alternativas.length; i++) {
          System.out.println(i + 1 + ". " + alternativas[i]);
      }

      Scanner scanner = new Scanner(System.in);
      int resposta = scanner.nextInt();
      scanner.nextLine(); // Limpa o buffer de entrada

      if (resposta >= 1 && resposta <= alternativas.length) {
          return alternativas[resposta - 1];
      } else {
          return "Opção inválida";
      }
  }

  public String[] getAlternativas() {
    return alternativas;
  }
}

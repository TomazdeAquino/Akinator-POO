package com.mycompany.akinator.poo;

public class Jogo {
  public static void jogar() {
    System.out.println("Bem-vindo ao jogo Akinator!");
    
    System.out.println("Memorise um dos eletrodomesticos abaixo e respondas as perguntas que vou adinhar.\n");
    System.out.println("Geladeira  |  Secador de cabelo");
    System.out.println("Microondas |  Ar condicionado");
    System.out.println("Televisão  |  Computador");
    System.out.println("Video game |  Máquina de lavar roupa");
    System.out.println("Chuveiro   |  Ferro de passar roupa\n\n");

    Perguntas p[] = new Perguntas[6];
    p[0] = new Perguntas("Em qual local da casa esse eletrodoméstico fica?",
        new String[] { "Cozinha", "Sala", "Banheiro", "Quarto", "Lavanderia" });
    p[1] = new Perguntas("Seu eletrodoméstico refrigera?", new String[] { "Sim", "Não" });
    p[2] = new Perguntas("Seu eletrodoméstico tem display?", new String[] { "Sim", "Não" });
    p[3] = new Perguntas("Seu eletrodoméstico é portátil?", new String[] { "Sim", "Não" });
    p[4] = new Perguntas("Seu eletrodoméstico emite som?", new String[] { "Sim", "Não" });

    String local_casa = p[0].fazerPergunta();
    String refrigera = p[1].fazerPergunta();
    String possui_display = p[2].fazerPergunta();
    String portatil = p[3].fazerPergunta();
    String emite_som = p[4].fazerPergunta();

    if (local_casa.equalsIgnoreCase("Cozinha")) {
      if (refrigera.equalsIgnoreCase("Sim")) {
        System.out.println("Você está pensando em uma geladeira!");
      } else if (refrigera.equalsIgnoreCase("Não")) {
        System.out.println("Você está pensando em um microondas!");
      }
    } else if (local_casa.equalsIgnoreCase("Sala")) {
      if (possui_display.equalsIgnoreCase("Sim")) {
        System.out.println("Você está pensando em uma televisão!");
      } else if (possui_display.equalsIgnoreCase("Não")) {
        System.out.println("Você está pensando em um video game!");
      }
    } else if (local_casa.equalsIgnoreCase("Banheiro")) {
      if (portatil.equalsIgnoreCase("Sim")) {
        System.out.println("Você está pensando em um secador de cabelo!");
      } else if (portatil.equalsIgnoreCase("Não")) {
        System.out.println("Você está pensando em um chuveiro!");
      }
    } else if (local_casa.equalsIgnoreCase("Quarto")) {
      if (refrigera.equalsIgnoreCase("Sim")) {
        System.out.println("Você está pensando em um ar condicionado!");
      } else if (refrigera.equalsIgnoreCase("Não")) {
        System.out.println("Você está pensando em um computador!");
      }
    } else if (local_casa.equalsIgnoreCase("Lavanderia")) {
      if (emite_som.equalsIgnoreCase("Sim")) {
        System.out.println("Você está pensando em uma máquina de lavar roupa!");
      } else if (emite_som.equalsIgnoreCase("Não")) {
        System.out.println("Você está pensando em um ferro de passar roupa!");
      }
    }
  }
}

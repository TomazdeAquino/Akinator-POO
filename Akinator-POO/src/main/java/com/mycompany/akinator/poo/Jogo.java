package com.mycompany.akinator.poo;

import javax.swing.JOptionPane;

public class Jogo {
  public static void jogar() {
        // Criar a lista de eletrodomésticos disponíveis
        String[] eletrodomesticos = {
            "Geladeira", "Microondas", "Televisão", "Video Game",
            "Secador de Cabelo", "Chuveiro", "Ar Condicionado", "Computador",
            "Máquina de Lavar Roupa", "Ferro de Passar Roupa"
        };

        // Construir a mensagem com a lista de eletrodomésticos
        StringBuilder mensagem = new StringBuilder("Bem-vindo ao jogo Akinator!\n\n");
        mensagem.append("Memorize um dos eletrodomésticos abaixo e responda as perguntas que vou fazer:\n\n");

        for (String eletrodomestico : eletrodomesticos) {
            mensagem.append("- ").append(eletrodomestico).append("\n");
        }

        // Exibir a mensagem informativa com o botão "OK"
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Início do Jogo", JOptionPane.INFORMATION_MESSAGE);

     // Criar o array de perguntas
        Perguntas[] p = new Perguntas[5];
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

    // Identificar eletrodoméstico
        String eletrodomestico = identificarEletrodomestico(local_casa, refrigera, possui_display, portatil, emite_som);

        // Exibir resultado em uma janela
        JOptionPane.showMessageDialog(null, "Você está pensando em: " + eletrodomestico);
    }

    // Identificar o eletrodoméstico com base nas respostas
    private static String identificarEletrodomestico(String local_casa, String refrigera, String possui_display,
            String portatil, String emite_som) {
        if (local_casa.equalsIgnoreCase("Cozinha")) {
            if (refrigera.equalsIgnoreCase("Sim")) {
                return "geladeira";
            } else if (refrigera.equalsIgnoreCase("Não")) {
                return "microondas";
            }
        } else if (local_casa.equalsIgnoreCase("Sala")) {
            if (possui_display.equalsIgnoreCase("Sim")) {
                return "televisão";
            } else if (possui_display.equalsIgnoreCase("Não")) {
                return "video game";
            }
        } else if (local_casa.equalsIgnoreCase("Banheiro")) {
            if (portatil.equalsIgnoreCase("Sim")) {
                return "secador de cabelo";
            } else if (portatil.equalsIgnoreCase("Não")) {
                return "chuveiro";
            }
        } else if (local_casa.equalsIgnoreCase("Quarto")) {
            if (refrigera.equalsIgnoreCase("Sim")) {
                return "ar condicionado";
            } else if (refrigera.equalsIgnoreCase("Não")) {
                return "computador";
            }
        } else if (local_casa.equalsIgnoreCase("Lavanderia")) {
            if (emite_som.equalsIgnoreCase("Sim")) {
                return "máquina de lavar roupa";
            } else if (emite_som.equalsIgnoreCase("Não")) {
                return "ferro de passar roupa";
            }
        }
        return "Eletrodoméstico não identificado";
    }
}

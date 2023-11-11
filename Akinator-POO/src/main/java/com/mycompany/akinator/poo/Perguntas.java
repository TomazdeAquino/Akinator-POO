package com.mycompany.akinator.poo;

import javax.swing.JOptionPane;

public class Perguntas {
    private String enunciado;
    private String[] opcoes;

    public Perguntas(String enunciado, String[] opcoes) {
        this.enunciado = enunciado;
        this.opcoes = opcoes;
    }

    public String fazerPergunta() {
        return (String) JOptionPane.showInputDialog(
                null,
                enunciado,
                "Responda:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
    }
}

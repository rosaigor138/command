package org.example;

public class Texto {

    private int anoCriacao;
    private int periodoCriacao;
    private String situacao;

    public Texto(int ano, int periodoCriacao) {
        this.anoCriacao = ano;
        this.periodoCriacao = periodoCriacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void escrever() {
        this.situacao = "Texto escrito";
    }

    public void apagar() {
        this.situacao = "Texto apagado";
    }
}
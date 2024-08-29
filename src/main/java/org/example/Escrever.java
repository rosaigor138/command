package org.example;

public class Escrever implements Editor {

    private Texto texto;

    public Escrever(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.escrever();
    }

    public void cancelar() {
        this.texto.apagar();
    }
}
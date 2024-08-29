package org.example;


public class Apagar implements Editor {

    private Texto texto;

    public Apagar(Texto texto) {
        this.texto = texto;
    }

    public void executar() {
        this.texto.apagar();
    }

    public void cancelar() {
        this.texto.escrever();
    }
}
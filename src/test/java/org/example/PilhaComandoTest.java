package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PilhaComandoTest {

    PilhaComando pilhaComando;
    Texto texto;

    @BeforeEach
    void setUp() {
        pilhaComando = new PilhaComando();
        texto = new Texto (2021, 1);
    }

    @Test
    void deveEscreverTexto() {
        Editor escrever = new Escrever(texto);
        pilhaComando.executarEdicao(escrever);

        assertEquals("Texto escrito", texto.getSituacao());
    }

    @Test
    void deveApagarTexto() {
        Editor apagar = new Apagar(texto);
        pilhaComando.executarEdicao(apagar);

        assertEquals("Texto apagado", texto.getSituacao());
    }

    @Test
    void deveCancelarApagarTexto() {
        Editor escrever = new Escrever(texto);
        Editor apagar = new Apagar(texto);

        pilhaComando.executarEdicao(escrever);
        pilhaComando.executarEdicao(apagar);

        pilhaComando.cancelarUltimaTarefa();

        assertEquals("Texto escrito", texto.getSituacao());
    }

}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class PilhaComando {

    private List<Editor> editors = new ArrayList<Editor>();

    public void executarEdicao(Editor editor) {
        this.editors.add(editor);
        editor.executar();
    }

    public void cancelarUltimaTarefa() {
        if (editors.size() != 0) {
            Editor editor;
            editor= this.editors.get(this.editors.size() - 1);
            editor.cancelar();
            this.editors.remove(this.editors.size() - 1);
        }
    }

}
package SubmissaoDeArtigos.controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProgramaFechador extends WindowAdapter {//Toda vez que o programa fecha vai ser acionado
    
    @Override
    public void windowClosing(WindowEvent e) {
        // Aqui você pode realizar qualquer ação necessária antes de encerrar o programa
        // Por exemplo, salvar dados, fechar conexões, etc.
        
        // Encerra o programa
        System.exit(0);
    }
}

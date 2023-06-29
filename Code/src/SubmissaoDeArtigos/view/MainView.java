package SubmissaoDeArtigos.view;


import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.controller.*;
import java.awt.event.*;
import javax.swing.JFrame;




public class MainView extends javax.swing.JFrame implements Observer{

    private Model model;	// Guarda o modelo a ser utilizado
    private MainViewController controller;	// Guarda o controller a ser utilizado

    public MainView() {
        initComponents();
        this.addWindowListener(new ProgramaFechador());


    }
    
    	public void update() {
		
	}

    public void initMainView(Model model) {
		this.model = model;	// Guarda o modelo
		controller = new MainViewController();	// Cria seu controller
		controller.initMainViewController(model, this);	// Inicializa o controller
		model.attachObserver(this);	// Registra a view na lista de observadores do modelo
		
                //
                		this.model = model;	// Guarda o modelo
		controller = new MainViewController();	// Cria seu controller
		controller.initMainViewController(model, this);	// Inicializa o controller
		model.attachObserver(this);	// Registra a view na lista de observadores do modelo	// Chama o menu principal
                //
                
                controller.initTelaCadastro();
                
                /*
                java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new MainView().setVisible(true);
                }});
                */

	}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

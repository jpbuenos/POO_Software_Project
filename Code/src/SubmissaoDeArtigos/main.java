package SubmissaoDeArtigos;


import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.controller.*;



public class main { //poe o derby na libraries na classpath


    public static void main(String[] args) {
        Model model = new Model(); // Primeiro instancia-se o modelo
        MainView view = new MainView(); // Depois cria-se a primeira view
        view.initMainView(model); // Por fim, inicializa a view passando o modelo
        

        //RevisorView viewRevisor = new RevisorView();
        //viewRevisor.initRevisorView(model);
        // Configura o ProgramaFechador como o listener para o evento de fechamento da janela principal
        

             
    }
}

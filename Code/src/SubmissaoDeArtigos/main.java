package SubmissaoDeArtigos;


import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.bd.*;
import SubmissaoDeArtigos.view.*;
import SubmissaoDeArtigos.controller.*;



public class main { //poe o dorbey na libraries na classpath


    public static void main(String[] args) {
        Model model = new Model(); // Primeiro instancia-se o modelo
        MainView view = new MainView(); // Depois cria-se a primeira view
        view.initMainView(model); // Por fim, inicializa a view passando o modelo
    

        // Configura o ProgramaFechador como o listener para o evento de fechamento da janela principal
        

             
    }
}

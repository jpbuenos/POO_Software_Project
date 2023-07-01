package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class TelaCadastroController implements Observer {
    private Model model; //Guarda o MODEL GERAL!!
    private TelaCadastro view; //Guarda a sua view
    public int x = 10;
    

    public void initTelaCadastroController(Model model, TelaCadastro view) {
		this.model = model;  // Guarda o modelo
		this.view = view;	 // Guarda a view
                model.attachObserver(this);
	}
    
    public String login(String nome,String senha,String tipo){
        
        if(nome == null && senha == null && tipo == null){
        return "Digite valores validos";
        }else{
        
        }
        
        return "";
    }
    
   
  
    
    
    
    
    public void update() {//Observer
    }
    
    
}

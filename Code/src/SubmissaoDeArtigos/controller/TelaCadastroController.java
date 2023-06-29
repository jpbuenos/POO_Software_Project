package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class TelaCadastroController implements Observer {
    private Model model; //Guarda o MODEL GERAL!!
    private TelaCadastro view; //Guarda a sua view
    
    public void initLoginUserViewController(Model model, TelaCadastro view) {
		this.model = model;
		this.view = view;
		model.attachObserver(this);
	}
    
    
    
    
    
    public void update() {//Observer
    }
    
    
}

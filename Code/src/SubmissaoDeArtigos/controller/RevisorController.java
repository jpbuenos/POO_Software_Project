package SubmissaoDeArtigos.controller;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.view.*;

public class RevisorController implements Observer{
    private Model model;
    private Revisor view;
    
    public void InitUserViewRevisorController(Model model, Revisor view){
        this.model = model;
        this.view = view;
        model.attachObserver(this);
    }
    
    @Override
    public void update(){
    }
}



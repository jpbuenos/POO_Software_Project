/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubmissaoDeArtigos.controller;

import SubmissaoDeArtigos.view.cadAutorView;
import SubmissaoDeArtigos.model.*;

/**
 *
 * @author Windows 10
 */
public class cadAutorController {
    
    public boolean cadastroAutor(String Nome, String Vinculacao, String Email, String Senha, String confirmarSenha ){
        if(Nome != null && Nome.length()>0 && Vinculacao != null && Vinculacao.length()>0 && Email != null && Email.length()>0 && Senha != null && Senha.length()>0 && confirmarSenha != null && confirmarSenha.length()>0){
            Autor autor = new Autor();
            autor.cadastrarAutor(autor);
            return true;
        }
        return false;
    }
    
}

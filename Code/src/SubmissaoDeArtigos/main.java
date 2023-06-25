package SubmissaoDeArtigos;


import java.util.*;
import SubmissaoDeArtigos.model.*;
import SubmissaoDeArtigos.bd.*;


public class main {


    public static void main(String[] args) {
        
        //DatabaseInitializer.initializeDatabase(); Só roda uma vez, serve para criar a pasta do banco
        
        DataInserter add = new DataInserter(); // cria o objeto insert
        
        add.insertPessoa("LISBOA", java.sql.Date.valueOf("1990-05-15"), "antoniolasa"); // adiciona no banco
        
        Datadelete ext = new Datadelete("jdbc:derby:banco"); //cria o objeto delete
        
        
        PessoaDAO pessoaDAO = new PessoaDAO("jdbc:derby:banco");

        List<Pessoa> pessoas = pessoaDAO.obterTodasAsPessoas();

        for (Pessoa pessoa : pessoas) {
            System.out.println("ID: " + pessoa.getId());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Data de Nascimento: " + pessoa.getDataDeNasc());
            System.out.println("Endereï¿½o de Email: " + pessoa.getEnderecoEmail());
            System.out.println("--------------------");
        }
        
        
    }
    
}

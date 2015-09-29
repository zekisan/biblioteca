/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ezequiel
 */
public class Livro {
    
    private int isbn;
    private String titulo;
    private ArrayList<Autor> autores = new ArrayList<Autor>();
    private Editora editora;
    private int ano;
    private boolean disponivel;
    
    public Livro(){}
    
    public Livro(int isbn, String titulo, String[] autores, Editora editora, int ano){
        this.isbn = isbn;
        this.titulo = titulo;
        cadastraAutores(autores);
        this.editora = editora;
        this.ano = ano;
        this.disponivel = true;
    }

    public void cadastraAutores(String[] autores){
        for(int i = 0; i < autores.length; i++){
            this.autores.add(new Autor(autores[i]));
        }
    }
    
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
        
    public String autoresToString(){
        String texto = "";
        for(int i = 0; i < autores.size(); i++){
            texto += autores.get(i).getNome();
            if(i < autores.size() - 1){
                texto += ", ";
            }
        }
        return texto;
    }
    
    public String disponivelToString(){
        if(disponivel) return "Sim";
        
        return "Não";
    }
}

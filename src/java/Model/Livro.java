/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
    
    public Livro(int isbn, String titulo, ArrayList<Autor> autores, Editora editora, int ano){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
        this.disponivel = true;
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
        
}

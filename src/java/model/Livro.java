/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


/**
 *
 * @author ezequiel
 */
public class Livro {
    
    @NotNull(message="ISBN não pode ficar em branco.")
    private long isbn;
    
    @NotEmpty(message="Título não pode ficar em branco.")
    private String titulo;
    private ArrayList<String> autores = new ArrayList<String>();
    private Editora editora;
    
    @NotNull(message="Ano não pode ficar em branco.")
    private int ano;
    private boolean disponivel;
    
    public Livro(){
        editora = new Editora();
    }
    
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
            this.autores.add(autores[i]);
        }
    }
    
    public long getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
    
    public void adicionaAutor(){
        this.autores.add("");
    }

    public void removeAutor(){
        this.autores.remove(autores.size() - 1);
    }
    
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    

    public boolean isDisponivel() {
        return disponivel;
    }
        
    public String autoresToString(){
        String texto = "";
        for(int i = 0; i < autores.size(); i++){
            texto += autores.get(i);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ezequiel
 */
public class Editora {
    private String id;
    private String nome;

    public Editora(){}
    
    public Editora(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    // Helpers
    public boolean equals(Object editora){
        return editora instanceof Editora && (id != null) ? id.equals(((Editora) editora).id) : (editora == this);
    }
    
    public int hashCode() {
        return id != null ? this.getClass().hashCode() + id.hashCode() : super.hashCode();
    }
    
    public String toString() {
        return nome;
    }
}

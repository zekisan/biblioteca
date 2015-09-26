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
public class Pessoa {

    private int matricula;
    private String nome;
    private String telefone;
    private Usuario usuario;
    
    public Pessoa(int matricula, String nome, String telefone, Usuario usuario){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
}

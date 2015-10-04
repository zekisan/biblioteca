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
public class Usuario {
    
    private long matricula;
    private String nome;
    private String telefone;
    private String login, senha, perfil;
    
    public Usuario(){}
    
    public Usuario(long matricula, String nome, String telefone, String login, String senha, String perfil){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public boolean verificaLogin(String login, String senha){
        return(this.login.equals(login) && this.senha.equals(senha));
    }
    
    public boolean isAdmin() {
        return perfil.equalsIgnoreCase("admin");
    }
}

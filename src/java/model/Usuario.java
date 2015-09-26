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
    
    private String login, senha, perfil;
    
    public Usuario(){}
    
    public Usuario(String login, String senha, String perfil){
        this.login = login;
        this.senha = senha;
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
    
    public boolean verificaLogin(String login, String senha){
        return(this.login.equals(login) && this.senha.equals(senha));
    }
    
    public boolean isAdmin() {
        return perfil.equalsIgnoreCase("admin");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Usuario;

/**
 *
 * @author ezequiel
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class UsuarioMB {
    //CRUD
    private List<Usuario> listaUsuarios;
    private Usuario usuarioSelecionado;

    public UsuarioMB() {
        usuarioSelecionado = new Usuario();
        listaUsuarios = new ArrayList<Usuario>();
        criarUsuarios();
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }
    
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String novoUsuario(){
        usuarioSelecionado=new Usuario();
        return("/admin/usuarios/novo?faces-redirect=true");
    }

    public String adicionarUsuario()
    {
        listaUsuarios.add(usuarioSelecionado);
        return("/admin/usuarios?faces-redirect=true");
    }

    public String editarUsuario(Usuario u){
        usuarioSelecionado = u;
        return("/admin/usuarios/editar?faces-redirect=true");
    }
    public String atualizarUsuario()
    {
        usuarioSelecionado=new Usuario();
        return("/admin/usuarios?faces-redirect=true");
    }

    public void removerUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    }
 
    private void criarUsuarios(){
        listaUsuarios.add(new Usuario(123456789, "João das Neves", "9988776655", "admin", "admin", "admin"));
        listaUsuarios.add(new Usuario(987654321, "Márcia Flores", "77889900", "marcia", "marcia", "cliente"));
        listaUsuarios.add(new Usuario(654321234, "James Bond", "55443322", "james", "james", "cliente"));
    }
}

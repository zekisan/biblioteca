
package bean;

import dao.UsuarioDAOJPA;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Usuario;
import utils.JPAUtils;

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
        return new UsuarioDAOJPA().listar();
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
        new UsuarioDAOJPA().salvar(usuarioSelecionado);
        return("/admin/usuarios?faces-redirect=true");
    }

    public String editarUsuario(Usuario u){
        usuarioSelecionado = u;
        return("/admin/usuarios/editar?faces-redirect=true");
    }
    public String atualizarUsuario()
    {
        new UsuarioDAOJPA().salvar(usuarioSelecionado);
        return("/admin/usuarios?faces-redirect=true");
    }

    public void removerUsuario(Usuario usuario){
        new UsuarioDAOJPA().remover(usuario);
    }
 
    private void criarUsuarios(){
        new UsuarioDAOJPA().salvar(new Usuario(123456789, "João das Neves", "9988776655", "admin", "admin", "admin"));
        new UsuarioDAOJPA().salvar(new Usuario(987654321, "Márcia Flores", "77889900", "marcia", "marcia", "cliente"));
        new UsuarioDAOJPA().salvar(new Usuario(654321234, "James Bond", "55443322", "james", "james", "cliente"));
    }
}

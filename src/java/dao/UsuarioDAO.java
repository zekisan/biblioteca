package dao;

import java.util.List;
import model.Usuario;

public interface UsuarioDAO {
    public void remover(Usuario u);
    public void salvar(Usuario u);
    public Usuario buscarPorId(int id);
    public Usuario buscarPorMatricula(int matricula);
    public List<Usuario> listar();           
}

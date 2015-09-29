/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Editora;
import model.Livro;

/**
 *
 * @author ezequiel
 */
@ManagedBean
@ApplicationScoped
public class LivroMB {

    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private Livro livroSelecionado;
    
    /**
     * Creates a new instance of LivroMB
     */
    public LivroMB() {
        livroSelecionado = new Livro();
        criarLivros();
    }

    private void criarLivros() {
        String[] temp1 = {"James Dovey", "Ash Furrow"};
        livros.add(new Livro(1387198798, "Beginning Objective-C", temp1, (new Editora("Apress")), 2015));
        
        String[] temp2 = {"Dovey James", "Furrow Ash"};
        livros.add(new Livro(1387198798, "Beginning Swift", temp2, (new Editora("Apress")), 2015));
        
        String[] temp3 = {"Jobs Steve"};
        livros.add(new Livro(1387198798, "Trying Objective-C", temp1, (new Editora("Apress")), 2015));
    }
    
    public ArrayList<Livro> listaLivros(){
        return livros;
    }
    
    public String editarLivro(Livro l){
        livroSelecionado = l;
        return("/admin/livros/editar?faces-redirect=true");
    }
    public String atualizarLivro()
    {
        return("/admin/index?faces-redirect=true");
    }

    public void removerLivro(Livro l){
        livros.remove(l);
    }
}

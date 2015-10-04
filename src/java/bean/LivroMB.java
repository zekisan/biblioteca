/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import model.Editora;
import model.EditoraDAO;
import model.Livro;

/**
 *
 * @author ezequiel
 */
@ManagedBean(eager = true)
@ApplicationScoped
public class LivroMB {

    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Editora> editoras = new ArrayList<Editora>();
    private Livro livroSelecionado;
    private Editora editoraSelecionada;
    EditoraDAO editoraDAO;
    
    public LivroMB() {
        livroSelecionado = new Livro();
        editoraDAO  = new EditoraDAO();
        criarLivros();
    }

    private void criarLivros() {
        
        String[] temp1 = {"James Dovey", "Ash Furrow"};
        livros.add(new Livro(1387198798, "Beginning Objective-C", temp1, editoraDAO.find("1"), 2015));
        
        String[] temp2 = {"Dovey James", "Furrow Ash"};
        livros.add(new Livro(1387198798, "Beginning Swift", temp2, editoraDAO.find("1"), 2015));
        
        String[] temp3 = {"Jobs Steve"};
        livros.add(new Livro(1387198798, "Trying Objective-C", temp3, editoraDAO.find("2"), 2015));
    }
    
    public ArrayList<Editora> getEditoras(){
        return editoraDAO.list();
    }
    
    public ArrayList<String> getAutores(){
        return livroSelecionado.getAutores();
    }
    
    public Editora getEditoraSelecionada(){
        return editoraSelecionada;
    }
    
    public void setEditoraSelecionada(Editora editora){
        this.editoraSelecionada = editora;
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
        populaAutores();
        livroSelecionado.setEditora(editoraSelecionada);
        return("/admin/livros?faces-redirect=true");
    }

    public void removerLivro(Livro l){
        livros.remove(l);
    }
    
    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public void setLivroSelecionado(Livro livroSelecionado) {
        this.livroSelecionado = livroSelecionado;
    }
    
    public void adicionaAutor(){
        livroSelecionado.adicionaAutor();
    }
    
    public void removeAutor(){
        livroSelecionado.removeAutor();
    }
    
    public String adicionarLivro()
    {
        livroSelecionado.setEditora(editoraSelecionada);
        populaAutores();
        livros.add(livroSelecionado);
        return("/admin/livros?faces-redirect=true");
    }
    
    public String novoLivro(){
        
        livroSelecionado = new Livro();
        return("/admin/livros/novo?faces-redirect=true");
    }
    
    private void populaAutores(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map<String, String> parameterMap = (Map<String, String>)   externalContext.getRequestParameterMap();
        int pos = 0;
        for (Map.Entry<String, String> item : parameterMap.entrySet()) {
            if(item.getKey().contains("idAutores")){
                livroSelecionado.getAutores().set(pos, item.getValue());
                pos++;
            }
        }
    }
    
    public ArrayList<Livro> getLivrosDisponiveis(){
        ArrayList<Livro> livrosDisponiveis = new ArrayList<Livro>();
        for(Livro l: livros){
            if(l.isDisponivel()) livrosDisponiveis.add(l);
        }
        return livrosDisponiveis;
    }
}

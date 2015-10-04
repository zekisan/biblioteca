/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import model.Livro;
import model.Retirada;

@ManagedBean
@ApplicationScoped
public class RetiradaMB {

    private Retirada retirada;
    private Livro livroSelecionado;
    private ArrayList<Livro> livrosSelecionados;
    private ArrayList<Livro> livrosDisponiveis;
    
    public RetiradaMB() {
        retirada = new Retirada();
        livroSelecionado = new Livro();
        livrosSelecionados = new ArrayList<Livro>();
    }
    
    public ArrayList<Livro> getLivrosDisponiveis(){
        FacesContext contexto = FacesContext.getCurrentInstance(); 
        LivroMB livroMB = (LivroMB) contexto.getExternalContext().getApplicationMap().get("livroMB");
        livrosDisponiveis = livroMB.getLivrosDisponiveis();
        return livrosDisponiveis;
    }
    
    public void setLivroSelecionado(Livro livro){
        this.livroSelecionado = livro;
    }
    
    public void setLivrosSelecionados(ArrayList<Livro> livrosSelecionados){
        this.livrosSelecionados = livrosSelecionados;
    }

    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public ArrayList<Livro> getLivrosSelecionados() {
        return livrosSelecionados;
    }
    
    public void setRetirada(Retirada retirada) {
        this.retirada = retirada;
    }

    public Retirada getRetirada() {
        return retirada;
    }

    public void adicionaLivro(){
        livrosSelecionados.add(livroSelecionado );
    }
}

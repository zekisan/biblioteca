/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import model.Livro;
import model.Retirada;

@ManagedBean(eager = true)
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

    public Livro getLivroSelecionado() {
        return livroSelecionado;
    }

    public ArrayList<Livro> getLivrosSelecionados() {
        return retirada.getLivros();
    }
    
    public void setRetirada(Retirada retirada) {
        this.retirada = retirada;
    }

    public Retirada getRetirada() {
        return retirada;
    }
    
    public Date getDataPrevistaEntrega(){
        return retirada.getDataPrevistaEntrega();
    }
    
    public void setDataPrevistaEntrega(Date dataPrevistaEntrega){
        retirada.setDataPrevistaEntrega(dataPrevistaEntrega);
    }

    public void adicionaLivro(){
        retirada.adicionaLivro();
    }
    
    public String calculaDataEntrega(){
        return "oi";
    }
}

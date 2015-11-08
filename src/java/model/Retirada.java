/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ezequiel
 */
public class Retirada {
    
    private Usuario cliente;
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private Date dataRetirada;
    private Date dataPrevistaEntrega;
    private Date dataDevolucao;
    
    public Retirada(){}
    
    public Retirada(Usuario cliente, ArrayList<Livro> livros, Date dataRetirada){
        this.cliente = cliente;
        this.livros = livros;
        this.dataRetirada = dataRetirada;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    
    public Date calculaDataEntrega(){
        // Realizar o cálculo da data
        return this.dataPrevistaEntrega;
    }
    
    public void adicionaLivro(){
        this.livros.add(null);
    }
}

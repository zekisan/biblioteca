/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ezequiel
 */
public class Retirada {
    
    private Usuario cliente;
    private Livro[] livros = new Livro[3];
    private Date dataRetirada;
    private Date dataPrevistaEntrega;
    private Date dataDevolucao;
    
    public Retirada(Usuario cliente, Livro[] livros, Date dataRetirada){
        this.cliente = cliente;
        this.livros = livros;
        this.dataRetirada = dataRetirada;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public Livro[] getLivros() {
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
}

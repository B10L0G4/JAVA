package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.util.Date;

public class Produtos extends PanacheEntity {

    public String nome;
    public double preco;
    public Date dataCriacao;
    public Date dataAtualizacao;


}

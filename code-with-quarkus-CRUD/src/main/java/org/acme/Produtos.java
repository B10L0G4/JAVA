package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity // define que a classe é uma entidade
@Table(name = "produtos") // define o nome da tabela

public class Produtos extends PanacheEntity {

    public String nome;
    public double preco;
    @CreationTimestamp
    public Date dataCriacao;
    @UpdateTimestamp
    public Date dataAtualizacao;



}
//  docker run
//  -it
//  --rm=true --name quarkus_test -e MYSQL_ROOT_USER=root
//  -e MYSQL_ROOT_PASSWORD=root -e \MYSQL_DATABASE=test --network host mysql:8.0.33
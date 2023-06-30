package org.acme;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;


@Path("/produtos") // define o caminho da rota

@Produces(MediaType.APPLICATION_JSON) // define o tipo de retorno
@Consumes(MediaType.APPLICATION_JSON) // define o tipo de entrada

public class ProdutosResource {

    @GET // define o metodo da rota

    public List<Produtos> listarProdutos() {
        return Produtos.listAll(); // retorna todos os produtos. e herdada de PanacheEntity
    }

    @POST // define o metodo da rota
    @Transactional // define que a rota é transacional

    public void adicionarProduto(CadastrarProdutosDTO dto) {
        Produtos produtos = new Produtos(); // cria um novo produto
        produtos.nome = dto.nome; // define o nome do produto
        produtos.preco = dto.preco; // define o preço do produto
        produtos.persist(); // persiste o produto no banco de dados
    }

    @PUT // define o metodo da rota
    @Path("{id}") // define o parametro da rota
    @Transactional // define que a rota é transacional

    public void atualizarProduto(@PathParam("id") Long id, CadastrarProdutosDTO dto) {
        Optional<Produtos> produtoOp = Produtos.findByIdOptional(id); // busca o produto pelo id

        if (produtoOp.isEmpty()) { // verifica se o produto existe
            throw new NotFoundException(); // retorna um erro caso o produto não exista
        }
        Produtos produtos = produtoOp.get(); // converte o produto para o tipo Produtos
        produtos.nome = dto.nome; // define o nome do produto
        produtos.preco = dto.preco; // define o preço do produto
        produtos.persist(); // persiste o produto no banco de dados

    }

    @DELETE // define o metodo da rota
    @Path("{id}") // define o parametro da rota
    @Transactional // define que a rota é transacional

    public void deletarProduto(@PathParam("id") Long id) {
        Optional<Produtos> produtoOp = Produtos.findByIdOptional(id); // deleta o produto pelo id

        produtoOp.ifPresentOrElse(Produtos::delete, () -> { // verifica se o produto existe
            throw new NotFoundException(); // retorna um erro caso o produto não exista
        });
    }
}

package org.acme;



import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/produtos") // define o caminho da rota

@Produces(MediaType.APPLICATION_JSON) // define o tipo de retorno
@Consumes(MediaType.APPLICATION_JSON) // define o tipo de entrada

public class ProdutosResource {
    @GET // define o metodo da rota

    public List<Produtos> listarProdutos() {
        return Produtos.listAll(); // retorna todos os produtos. e herada de PanacheEntity

    }

}

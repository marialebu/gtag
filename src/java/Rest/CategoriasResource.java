/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Felipe.Diaz
 */
@Path("categorias")
public class CategoriasResource {

    //Manejador manejador;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CategoriasResource
     */
    public CategoriasResource() {
    }

    /**
     * Retrieves representation of an instance of Rest.CategoriasResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        //return Response.ok(manejador.getCategorias()).build();
        return null;
    }

    /**
     * PUT method for updating or creating an instance of CategoriasResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

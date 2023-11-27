package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * This would normally come from a maven dependency.
 */
@Path("/todos")
public interface ExampleRestService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Todo getTodo(@PathParam("id") int id);
}

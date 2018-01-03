package company.sv.auth.endpoints;

import company.sv.auth.models.User;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/auth")
public class Auth {
    @GET
    @Path("/{name}")
    public Response sayHello(@PathParam("name") String msg) {
        String output = "Hello, " + msg + "!";
        return Response.status(200).entity(output).build();
    }

    @Path("test")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String testForm(@FormParam("accept") String accept) {
        return accept;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/create")
    public Response sayHello() {
        String output = "Hello, " + "!";
        return Response.status(200).entity(output).build();
    }
}

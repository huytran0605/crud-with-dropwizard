package com.demo.resources;

import com.demo.db.UserDB;
import com.demo.representation.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.net.URISyntaxException;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    
    @GET
    public Response getUsers() {
        return Response.ok(UserDB.getUsers()).build();
    }
    
    @GET
    @Path("/{id}")
    public Response getUserById(@PathParam("id") Integer id) {
        User user = UserDB.getUser(id);
        if (user != null)
            return Response.ok(user).build();
        else
            return Response.status(Status.NOT_FOUND).build();
    }
    
    @POST
    public Response createUser(User user) throws URISyntaxException {
        Integer userId = user.getId();
        UserDB.updateUser(userId, user);
        return Response.ok(user).build();
    }
    
    @PUT
    @Path("/{id}")
    public Response updateUser(@PathParam("id") Integer id, User user) {
        User u = UserDB.getUser(id);
        if(u != null) {
            user.setId(id);
            UserDB.updateUser(id, user);
            return Response.ok(user).build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
    @DELETE
    @Path("/{id}")
    public Response removeUser(@PathParam("id") Integer id) {
        User u = UserDB.getUser(id);
        UserDB.removeUser(id);
        return Response.ok(u).build();
    }
}

package org.restapi;

import io.smallrye.common.constraint.NotNull;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
public class restApi {

    @GET
    public Response getList() {
//        Person person = new Person("ram","pradop","s");
        List<Person> person = Person.findAll().list();
        return Response.ok(person).build();
    }

    @GET
    @Path("{id}")
    public Response getSingle(@PathParam("id") Long id) {
        Person person = Person.findById(id);
        return Response.ok(person).build();
    }

    @POST
    @Transactional
    public Response save(@NotNull PersonModel model) {

        Person person = new Person(model.firstName, model.lastName, model.otherName);
        person.persist();

        return Response.ok(person).build();
    }

    @PUT
    @Transactional
    @Path("{id}")
    public Response update(@PathParam("id") Long id, @NotNull PersonModel model) {

        Person person = Person.findById(id);

        if(person == null) {
            throw new WebApplicationException("Person with this id does not exist",404);
        }

        person.firstName = model.firstName;
        person.lastName = model.lastName;
        person.otherName = model.otherName;

        return Response.ok(person).build();
    }

    @DELETE
    @Transactional
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {

        Person person = Person.findById(id);

        if(person == null) {
            throw new WebApplicationException("Person with this id does not exist",404);
        }

        person.delete();

        return Response.ok("Deleted Successfully").build();
    }
}

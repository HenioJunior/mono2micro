package org.acme.flight;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("flight")
public class FlightResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flight> flights() {

        return Flight.listAll();
    }

    @GET
    @Path("findById")
    public Flight flightById(@QueryParam("id") long id) {
        return Flight.findById(id);
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Flight newFlight(Flight flight) {
        flight.id = null;
        flight.persist();
        return flight;
    }
}

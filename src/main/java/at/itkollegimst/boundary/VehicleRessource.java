package at.itkollegimst.boundary;

import at.itkollegimst.repository.VehicleRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("vehicle")
public class VehicleRessource {

    @Inject
    VehicleRepository vehicleRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        var vehicleList = vehicleRepository.listAll();
        return Response.ok(vehicleList).build();
    }
}

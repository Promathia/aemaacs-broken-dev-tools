package com.mysite.core.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.wcm.caravan.jaxrs.publisher.JaxRsComponent;
import org.osgi.service.component.annotations.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

//https://caravan.wcm.io/jaxrs/publisher/

@Path("/locations")
@Component(immediate = true)
public class TestController implements JaxRsComponent {

    @GET
    @Path("/cities")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSuggestions() throws JsonProcessingException {
        final List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        return new ObjectMapper().writeValueAsString(cities);
    }

}

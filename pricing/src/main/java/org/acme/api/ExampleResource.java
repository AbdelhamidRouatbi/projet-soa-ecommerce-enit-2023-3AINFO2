package org.acme.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.api.dtos.OrderPricingDTO;

import java.math.BigDecimal;

@Path("/pricing-api")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    public BigDecimal checkPricing(OrderPricingDTO orderPricingDTO) {
        return BigDecimal.ONE;
    }
}

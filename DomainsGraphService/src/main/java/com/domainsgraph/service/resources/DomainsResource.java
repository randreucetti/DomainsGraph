package com.domainsgraph.service.resources;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.domainsgraph.core.Domain;

@Path("/domains")
@Produces(MediaType.APPLICATION_JSON)
public class DomainsResource {

  public DomainsResource() {

  }

  @GET
  @Timed
  public Domain sayHello(@QueryParam("domain") Optional<String> domain) {
    final String value = domain.orElse("ross.com");
    return Domain.builder()
        .setDomain(value)
        .setId(1)
        .build();
  }
}

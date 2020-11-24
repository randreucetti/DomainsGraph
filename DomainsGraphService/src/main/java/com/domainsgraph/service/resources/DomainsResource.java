package com.domainsgraph.service.resources;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.annotation.Timed;
import com.domainsgraph.core.Domain;
import com.domainsgraph.data.neo4j.DomainsManager;
import com.google.inject.Inject;

@Path("/domains")
@Produces(MediaType.APPLICATION_JSON)
public class DomainsResource {
  private static final Logger LOG = LoggerFactory.getLogger(DomainsResource.class);
  private final DomainsManager domainsManager;

  @Inject
  public DomainsResource(DomainsManager domainsManager) {
    this.domainsManager = domainsManager;
  }

  @GET
  @Timed
  public List<Domain> getDomains(@QueryParam("domain") Optional<String> domain) {
    LOG.info("Getting domains {}", domain);
    return domainsManager.getDomains();
  }
}

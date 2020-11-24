package com.domainsgraph.service.config;

import com.domainsgraph.data.DomainsGraphDataModule;
import com.domainsgraph.service.health.DomainsGraphHealthCheck;
import com.domainsgraph.service.resources.DomainsResource;
import com.google.inject.AbstractModule;

public class DomainsGraphServiceModule extends AbstractModule {


  @Override
  public void configure() {
    install(new DomainsGraphDataModule());

    bind(DomainsResource.class);
    bind(DomainsGraphHealthCheck.class);
  }
}

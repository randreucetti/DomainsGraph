package com.domainsgraph.service.config;

import com.domainsgraph.service.health.DomainsGraphHealthCheck;
import com.google.inject.AbstractModule;

public class DomainsGraphHealthCheckModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(DomainsGraphHealthCheck.class);
  }
}

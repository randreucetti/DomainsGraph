package com.domainsgraph.service.config;

import com.domainsgraph.service.resources.DomainsResource;
import com.google.inject.AbstractModule;

public class DomainsGraphResourceModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(DomainsResource.class);
  }
}

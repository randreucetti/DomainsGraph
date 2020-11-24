package com.domainsgraph.service.health;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import ru.vyarus.dropwizard.guice.module.installer.feature.health.NamedHealthCheck;

@Singleton
public class DomainsGraphHealthCheck extends NamedHealthCheck {

  @Inject
  public DomainsGraphHealthCheck() {

  }

  @Override
  public String getName() {
    return "domain-graph-health-check";
  }

  @Override
  protected Result check() {
    return Result.healthy();
  }
}

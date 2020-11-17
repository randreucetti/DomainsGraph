package com.domainsgraph.service.health;

import com.codahale.metrics.health.HealthCheck;

public class DomainsGraphHealthCheck extends HealthCheck {
  @Override
  protected Result check() {
    return Result.healthy();
  }
}

package com.domainsgraph.service;

import com.domainsgraph.service.health.DomainsGraphHealthCheck;
import com.domainsgraph.service.resources.DomainsResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DomainsGraphApplication extends Application<DomainsGraphConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DomainsGraphApplication().run(args);
    }

    @Override
    public String getName() {
        return "DomainsGraph";
    }

    @Override
    public void initialize(final Bootstrap<DomainsGraphConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DomainsGraphConfiguration configuration,
                    final Environment environment) {
        final DomainsResource resource = new DomainsResource();
        final DomainsGraphHealthCheck healthCheck =
            new DomainsGraphHealthCheck();
        environment.healthChecks().register("DomainsGraph", healthCheck);
        environment.jersey().register(resource);
    }

}

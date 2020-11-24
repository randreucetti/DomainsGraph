package com.domainsgraph.service;

import com.domainsgraph.service.config.DomainsGraphServiceModule;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

public class DomainsGraphService extends Application<DomainsGraphConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DomainsGraphService().run(args);
    }

    @Override
    public String getName() {
        return "DomainsGraphService";
    }

    @Override
    public void initialize(final Bootstrap<DomainsGraphConfiguration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
            .modules(new DomainsGraphServiceModule())
        .build());
    }

    @Override
    public void run(final DomainsGraphConfiguration configuration,
                    final Environment environment) {
    }
}

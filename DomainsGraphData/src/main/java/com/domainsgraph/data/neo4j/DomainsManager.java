package com.domainsgraph.data.neo4j;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.domainsgraph.core.Domain;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DomainsManager {
  private static final Random RANDOM = new Random();
  private static final String DOMAIN_FORMAT = "%s.com";

  @Inject
  public DomainsManager() {

  }

  public List<Domain> getDomains() {
    int recordsToGenerate = RANDOM.nextInt(50);

    return IntStream.range(0, recordsToGenerate)
        .mapToObj(i -> Domain.builder()
            .setId(i)
            .setDomain(String.format(DOMAIN_FORMAT, RandomStringUtils.randomAlphabetic(5)))
            .build())
        .collect(ImmutableList.toImmutableList());
  }
}

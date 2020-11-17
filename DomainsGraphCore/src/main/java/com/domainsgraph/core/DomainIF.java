package com.domainsgraph.core;

import org.immutables.value.Value;

import com.domainsgraph.core.style.RossStyle;

@Value.Immutable
@RossStyle
public interface DomainIF {
  int getId();
  String getDomain();
}

package com.example.carrentaldemo.domain.ddd.domain.base;

public interface AggregateRoot extends DomainObject {

    String retrieveIdentifier();
}

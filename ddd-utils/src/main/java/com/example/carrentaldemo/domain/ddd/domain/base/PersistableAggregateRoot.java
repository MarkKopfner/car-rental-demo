package com.example.carrentaldemo.domain.ddd.domain.base;


import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public abstract class PersistableAggregateRoot<I extends Serializable> extends BaseEntity<I> implements AggregateRoot {
}

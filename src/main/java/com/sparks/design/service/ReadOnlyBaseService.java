package com.sparks.design.service;

import com.sparks.design.repository.ReadOnlyRepository;
import com.sparks.design.repository.Repository;

public abstract class ReadOnlyBaseService<TE, T> {

    private final Repository<TE, T> repository;

    ReadOnlyBaseService(ReadOnlyRepository<TE,T> repository){
        this.repository = (Repository<TE, T>) repository;
    }
}

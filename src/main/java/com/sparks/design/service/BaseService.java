package com.sparks.design.service;

import com.sparks.design.entities.BaseEntity;
import com.sparks.design.repository.Repository;

import java.util.Collection;

public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE,T> {
    private final Repository<TE, T> _repository;

    BaseService(Repository<TE,T> repository){
        super(repository);
        _repository = repository;
    }

    public void add(TE entity) throws Exception {
        _repository.add(entity);
    }

    public Collection<TE> getAll(){
        return _repository.getAll();
    }
}

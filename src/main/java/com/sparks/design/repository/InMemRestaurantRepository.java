package com.sparks.design.repository;

import com.sparks.design.entities.Restaurant;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemRestaurantRepository implements RestaurantRepository<Restaurant, String>{
    private Map<String, Restaurant> entities;

    public InMemRestaurantRepository(){
        entities = new HashMap<>();
    }


    @Override
    public boolean contains(String id) {
        throw new UnsupportedOperationException("Not Supported yet");
        //not there yet
    }

    @Override
    public Restaurant get(String id) {
        throw new UnsupportedOperationException("Not Supported yet");
        //return null;
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }

    @Override
    public void add(Restaurant entity) {
        entities.put(entity.getName(), entity);
    }

    @Override
    public void remove(String id) {
        if(entities.containsKey(id)){
            entities.remove(id);
        }
    }

    @Override
    public void update(Restaurant entity) {
        if(entities.containsKey(entity.getName())){
            entities.put(entity.getName(), entity);
        }
    }

    @Override
    public boolean containsName(String name) {
        return entities.containsKey(name);
    }
}

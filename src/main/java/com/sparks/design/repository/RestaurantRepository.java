package com.sparks.design.repository;

import com.sparks.design.entities.Restaurant;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String>{
    boolean containsName(String name);
}



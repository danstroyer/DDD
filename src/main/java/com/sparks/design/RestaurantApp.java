package com.sparks.design;

import com.sparks.design.entities.Restaurant;
import com.sparks.design.entities.Table;
import com.sparks.design.repository.InMemRestaurantRepository;
import com.sparks.design.service.RestaurantService;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class RestaurantApp {
    public static void main(String...args){
        try{
            RestaurantService restaurantService = new RestaurantService(new InMemRestaurantRepository());

            List<Table> tableList = Arrays.asList(
              new Table("Table1", BigInteger.ONE, 6),
              new Table("Table2", BigInteger.valueOf(2), 4),
              new Table("Table3", BigInteger.valueOf(3),2)
            );

            restaurantService.add(new Restaurant("Big O Restaurant", "1", tableList));
            restaurantService.add(new Restaurant("Pizza Shops", "2", null));
            restaurantService.add(new Restaurant("La Pasta", "3", null));

            Collection<Restaurant> restaurants = restaurantService.getAll();

            System.out.println("Restaurant List:");
            restaurants.stream()
                    .map(r -> String.format("Restaurant: %s",r))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

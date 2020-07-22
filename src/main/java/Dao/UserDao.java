package Dao;

import models.Users;
import java.util.List;

public interface UserDao {

    //create
    void add (Users users);
    // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype)

    //read
    List<Users> getAll();
    Users findById(int id);
    // List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId);

    //update
    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    //delete
    void deleteById(int id);
    void clearAll();
}
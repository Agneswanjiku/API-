package Dao;

import models.Departments;
import java.util.List;

public interface DepartmentsDao{

    //create
    void add (Departments departments);
    // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype)

    //read
    List<Departments> getAll();
    Departments findById(int id);
    // List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId);

    //update
    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    List<Departments> getAllReviewsByRestaurant(int restaurantId);

    //delete
    void deleteById(int id);
    void clearAll();
}
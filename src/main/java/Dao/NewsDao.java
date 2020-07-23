package Dao;

import models.News;
import java.util.List;

public interface NewsDao {

    //create
    void add (News news);
    // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype)

    //read
    List<News> getAll();
    News findById(int id);
    // List<News> getAllFoodtypesForNews(String collageId);

    //update
    void update( String name, String address);

    //delete
    void deleteById(int id);
    void clearAll();

    List<News> getAllNewsByDepartments(int departmentsId);
}
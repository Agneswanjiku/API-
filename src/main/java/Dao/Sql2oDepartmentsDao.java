package Dao;

import models.Departments;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import org.sql2o.Connection;
import java.util.List;

public  class Sql2oDepartmentsDao implements DepartmentsDao{
    private final Sql2o sql2o;
    public Sql2oDepartmentsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Departments departments) {
            String sql = "INSERT INTO departments (department, description,  number_employees) VALUES (:department, :description, :number_employees)";
            try(Connection conn = sql2o.open()){
                int id = (int) conn.createQuery(sql, true)
                        .bind(departments)
                        .executeUpdate()
                        .getKey();
                departments.setId(id);
            }catch (Sql2oException ex){
                System.out.println(ex);
            }
    }


    @Override
    public List<Departments> getAll() {
        return null;
    }

    @Override
    public void deleteById(String name) {

    }

    @Override
    public void clearAll() {

    }
}
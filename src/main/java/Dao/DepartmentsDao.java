package Dao;

import exception.models.Departments;
import java.util.List;

public interface DepartmentsDao {

    //create
    void add(Departments departments);
    //void addDepartmentToDepartment(Department department, Department department);

    //read
    List<Departments> getAll();
    // List<Department> getAllDepartmentsForAdepartmenttype(String name);

    //update
    //omit for now

    //delete
    void deleteById(String name);
    void clearAll();
}
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    } @Test
    public void setName() {
        Departments testDepartments = setUpDepartments();
        testDepartments.setName("name");
        assertNotEquals("agnes", testDepartments.getName());
    }

    @Test
    public void Department_instantiatesWithCorrectValues() throws Exception{
        Departments testdepartments = setUpDepartments();
        assertEquals("070012344", testdepartments.getPhone());
        assertEquals("name",testdepartments.getName());
        assertEquals("address",testdepartments.getAddress());
        assertEquals("shikonorma@gmail.com", testdepartments.getWebsite());
    }

    @Test
    public void getName() {
        Departments testDepartments = setUpDepartments();
        assertEquals("name", testDepartments.getName());
    }


    @Test
    public void setId() throws Exception{
        Departments testDepartments = setUpDepartments();
        testDepartments.setId(3);
        assertNotEquals(2,testDepartments.getId());
    }

    public Departments setUpDepartments(){
        return new Departments("name", "address", "070012344", "shikonorma@gmail.com", "website" );
    }
}

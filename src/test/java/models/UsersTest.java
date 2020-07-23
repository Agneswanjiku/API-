package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    private Object Users;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void setId() throws Exception{
        Users testUsers = setUpUsers();
        testUsers.setId(3);
        assertNotEquals(2,testUsers.getId());
    }




    @Test
    public void News_instantiatesWithCorrectValues() throws Exception{
        Users testusers = setUpUsers();
        assertEquals("0", testusers.getId());
        assertEquals("roles",testusers.getroles());

    }
    public Users setUpUsers(){
        return new Users("id", "roles", "employes");
    }


}

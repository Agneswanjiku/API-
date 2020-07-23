package Dao;

import exception.models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oUsersDao implements UserDao {
    private final Sql2o sql2o;
    public Sql2oUsersDao(Sql2o sql2o) { this.sql2o = sql2o; }

    @Override
    public void add(Users users) {
        String sql = "INSERT INTO reviews (clientNews collageNews) VALUES (:clientNews, :collageNews)"; //if you change your model, be sure to update here as well!
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(users)
                    .executeUpdate()
                    .getKey();
            Users.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }



    @Override
    public List<Users> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM reviews")
                    .executeAndFetch(Users.class);
        }
    }

    @Override
    public Users findById(int id) {
        return null;
    }

    @Override
    public void update(int id, String name, String address, String phone, String website, String email) {

    }



//    @Override
//    public void update(int id, String name, String address, String zipcode, String phone, String website, String email) {
//
//    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from reviews WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE from reviews";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }
}
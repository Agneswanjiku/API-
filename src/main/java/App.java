import static spark.Spark.*;
import Dao.Sql2oDepartmentsDao;
import Dao.UserDao;
import Dao.NewsDao;
import models.News;
import models.Departments;
import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.port;

import java.util.List;


 public static void main(String[]args){

        }(String[]args){
    Sql2oNewsDao newsDao;
    Sql2oUserDao usersDao;
    Sql2odepertment departmentDao;
    Connection connection;
    Gson gson = new Gson();
        }

    String connectionString = "jdbc:postgresql:|| localhost:5432/organisational_db";
    newsDao = new Sql2oNewsDao (sql2o);
    userDao = new Sql2oUserDao (sql2o);
    departmentsDao = new Sql2oDepartmntsDao (sql2o);
    connection = Sql2o.open();

post("department/new", "application/json",(request, response) ->{
    Departments departments = gson.fromJson(request.body(), Departments.class);
    response.status.(201);
    return gson.toJson(name)
        }

        get ("new" "application/json", (requst, response)-> {
        return gson.toJson(newsDao.getAllClientNews());
        });
        }

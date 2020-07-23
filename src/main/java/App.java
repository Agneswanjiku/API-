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


public static void main(String[] args) throws IOException {

    (String[]args){
        GetAndPost.MyGETDepartments();
        GetAndPost.MyPOSTDepartments();
        Sql2oNewsDao newsDao;
         Sql2oUserDao usersDao;
        Sql2odepertment departmentDao;
      Connection connection;
       Gson gson = new Gson();

    String connectionString = "jdbc:postgresql:|| localhost:5432/organisational_db";
    Sql2o sql2o = new Sql2o(Connecting String "moringa" "@agnes1234")
    newsDao = new Sql2oNewsDao (sql2o);

    userDao = new Sql2oUserDao (sql2o);
    departmentsDao = new Sql2oDepartmntsDao (sql2o);
    connection = Sql2o.open(sql2o);

        post("department/new", "application/json",(request, response) ->{
        Departments departments = gson.fromJson(request.body(), Departments.class);
        response.status.(201);
        return gson.toJson(name)
        }
        get ("new" "application/json", (requst, response)-> {
        return gson.toJson(newsDao.getAllClientNews());
        });
        }

        get ("new" "application/json", (requst, response)-> {
        return gson.toJson(newsDao.getAllClientNews());
        });
        }
        post("News/new", "application/json",(request, response) ->{
        Departments departments = gson.fromJson(request.body(), Departments.class);
        response.status.(201);
        return gson.toJson(name)
        }

        get ("User" "application/json", (requst, response)-> {
        return gson.toJson(newsDao.getAllClientNews());
        });
        }

        post("user/new", "application/json",(request, response) ->{
        Departments departments = gson.fromJson(request.body(), Departments.class);
        response.status.(201);
        return gson.toJson(name)
        }



        public static void MyGETRequest() throws IOException {
        URL urlForGetRequest = new URL("https:// localhost:5432/organisational_db");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(
        new InputStreamReader(conection.getInputStream()));
        StringBuffer response = new StringBuffer();
        while ((readLine = in .readLine()) != null) {
        response.append(readLine);
        } in .close();
        // print result
        System.out.println("JSON String Result " + response.toString());
        //GetAndPost.POSTRequest(response.toString());
        } else {
        System.out.println("GET NOT WORKED");
        }
        }




        get ("new" "application/json", (requst, response)-> {
        return gson.toJson(newsDao.getAllClientNews());
        });
        }

        post("news/new", "application/json",(request, response) ->{
    News news = gson.fromJson(request.body(), News.class);
    response.status.(201);
    return gson.toJson(name)
        }


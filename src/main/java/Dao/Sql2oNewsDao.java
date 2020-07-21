package Dao;

import Dao.NewsDao;
import dao.Connection;
import models.News;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oReviewDao implements NewsDao {
    private final Sql2o sql2o;
    public Sql2oReviewDao(Sql2o sql2o) { this.sql2o = sql2o; }

    @Override
    public void add(News news) {
        String sql = "INSERT INTO reviews (writtenby, content, rating, newsid) VALUES (:writtenBy, :content, :rating, :newsId)"; //if you change your model, be sure to update here as well!
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(news)
                    .executeUpdate()
                    .getKey();
            news.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<News> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM reviews")
                    .executeAndFetch(News.class);
        }
    }

    @Override
    public List<News> getAllnByResNews(int newsid) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM News WHERE newsId = :newsId")
                    .addParameter("newsId", newsId)
                    .executeAndFetch(News.class);
        }
    }

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
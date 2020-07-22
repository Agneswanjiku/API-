package models;

import java.util.Objects;

public class News {
    private String clientNews;
    private String collegeNews;
    private  String name;

    public News(String clientNews, String collegeNews) {
        super();
        this.clientNews = clientNews;
        this.collegeNews = collegeNews;
    }

    public String getClientNews() {
        return clientNews;
    }

    public void setName(String clientNews) {
        this.clientNews = clientNews;
    }
    public String getCollegeNews() {
        return collegeNews;
    }

    public void setCollegeNews(String collegeNews) {
        this.collegeNews = collegeNews;
    }

    public static void main(String[] args) {

        News news = new News("official", "official");
        News news2= new News("unofficial", "unofficial");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News news = (News) o;
        return getClientNews().equals(news.getClientNews()) &&
                getCollegeNews().equals(news.getCollegeNews());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientNews(), getCollegeNews());
    }
}
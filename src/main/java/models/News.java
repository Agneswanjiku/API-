package models;

public class News {
    private String clientNews;
    private String collegeNews;

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
}
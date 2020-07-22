package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {

    @Test
    public void setId() throws Exception{
        News testNews = setUpNews();
        testNews.setId(3);
        assertNotEquals(2,testNews.getId());
    }



    @Test
    public void News_instantiatesWithCorrectValues() throws Exception{
        News testnews = setUpNews();
        assertEquals("clientNews", testnews.getClientNews());
        assertEquals("collageNews",testnews.getCollegeNews());

    }
    public News setUpNews(){
        return new News("clientNews", "collageNews");
    }


}
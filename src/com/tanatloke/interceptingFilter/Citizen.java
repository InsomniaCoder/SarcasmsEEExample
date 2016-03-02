package com.tanatloke.interceptingFilter;

/**
 * Created by PorPaul on 2/3/2559.
 */
public class Citizen {
    public void readNews(News news){
        System.out.println("Citizen is reading news: "+news.getNews()+"  from news source");
    }
}

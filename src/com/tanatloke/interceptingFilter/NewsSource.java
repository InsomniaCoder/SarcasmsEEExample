package com.tanatloke.interceptingFilter;

/**
 * Created by Administrator on 21-Jan-16.
 */
public class NewsSource {

    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendNews(News news){
        System.out.println("News Source is sending message : "+news);
        filterManager.sendNewsThroughAllFilters(news);
    }
}

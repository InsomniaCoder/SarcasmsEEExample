package com.tanatloke.interceptingFilter.filter;

import com.tanatloke.interceptingFilter.News;

/**
 * Created by PorPaul on 2/3/2559.
 */
public class ElectionNewsFilter implements  ThaiFilter{
    @Override
    public void manipulateNews(News news) {
        String newsContent = news.getNews();
        if(newsContent.contains("election")){
            news.setNews(newsContent.replace("election","****"));
        }
    }
}

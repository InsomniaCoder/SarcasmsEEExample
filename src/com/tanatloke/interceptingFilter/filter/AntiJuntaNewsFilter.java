package com.tanatloke.interceptingFilter.filter;

import com.tanatloke.interceptingFilter.News;

/**
 * Created by Administrator on 21-Jan-16.
 */
public class AntiJuntaNewsFilter implements  ThaiFilter{
    @Override
    public void manipulateNews(News news) {
        String newsContent = news.getNews();
        if(newsContent.contains("junta")){
            news.setNews(newsContent.replace("junta","****"));
        }
    }
}

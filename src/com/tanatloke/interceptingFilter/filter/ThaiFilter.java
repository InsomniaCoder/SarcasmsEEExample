package com.tanatloke.interceptingFilter.filter;

/**
 * Created by Administrator on 21-Jan-16.
 */

import com.tanatloke.interceptingFilter.News;

/**
 * Thai filter is a Filter interface in Intercepting Filter design pattern
 * declare the sendNewsThroughAllFilters method that all filters will do to the request
 */
public interface ThaiFilter {
     void manipulateNews(News news);
}

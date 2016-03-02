package com.tanatloke.interceptingFilter;

import com.tanatloke.interceptingFilter.filter.ThaiFilter;

/**
 * Created by Administrator on 21-Jan-16.
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Citizen citizen){
        filterChain = new FilterChain();
        filterChain.setCitizen(citizen);
    }

    public void addFilter(ThaiFilter filter){
        filterChain.addFilter(filter);
    }

    public void sendNewsThroughAllFilters(News news){
        filterChain.doFilter(news);
    }

}

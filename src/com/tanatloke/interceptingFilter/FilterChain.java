package com.tanatloke.interceptingFilter;

import com.tanatloke.interceptingFilter.filter.ThaiFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 21-Jan-16.
 */
public class FilterChain {

    private List<ThaiFilter> thaiFilters = new ArrayList<>();
    private Citizen citizen;

    public void addFilter(ThaiFilter filter){
        thaiFilters.add(filter);
    }

    public void removeFilter(ThaiFilter filter){
        thaiFilters.remove(filter);
    }

    public  void setCitizen(Citizen citizen){
        this.citizen = citizen;
    }

    /**
     * Filter all the news and send the manipulated news to the target
     * @param news
     */
    public void doFilter(News news){
        for (ThaiFilter filter : thaiFilters) {
            filter.manipulateNews(news);
        }
        citizen.readNews(news);
    }


}

package com.tanatloke.interceptingFilter;

import com.tanatloke.interceptingFilter.filter.AntiJuntaNewsFilter;
import com.tanatloke.interceptingFilter.filter.ExPmNewsFilter;
import com.tanatloke.interceptingFilter.filter.TrueNewsFilter;

/**
 * Created by Administrator on 21-Jan-16.
 */
public class Main {

    public static void main(String[] args) {

        //create thai citizen as a target of the news
        Citizen thaiCitizen = new Citizen();
        // filterManager takes Citizen as a Target of the chain
        FilterManager filterManager = new FilterManager(thaiCitizen);
        //add all the filters to the chain through manager
        filterManager.addFilter(new AntiJuntaNewsFilter());
        filterManager.addFilter(new ExPmNewsFilter());
        filterManager.addFilter(new TrueNewsFilter());

        NewsSource theMirror = new NewsSource();
        theMirror.setFilterManager(filterManager);
        theMirror.sendNews(new News("  "));
    }
}

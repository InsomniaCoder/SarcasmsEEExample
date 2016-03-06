package com.tanatloke.interceptingFilter;

import com.tanatloke.interceptingFilter.filter.AntiJuntaNewsFilter;
import com.tanatloke.interceptingFilter.filter.ExPmNewsFilter;
import com.tanatloke.interceptingFilter.filter.ElectionNewsFilter;

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
        filterManager.addFilter(new ElectionNewsFilter());

        NewsSource theMirror = new NewsSource();
        theMirror.setFilterManager(filterManager);
        theMirror.sendNews(new News("Today's news we're gonna talk about thailand news including Thai expm, current junta government and a chance for election to be set up in Thailand....  "));
    }
}

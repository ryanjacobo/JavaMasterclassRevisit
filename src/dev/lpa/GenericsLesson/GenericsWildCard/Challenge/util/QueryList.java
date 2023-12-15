package dev.lpa.GenericsLesson.GenericsWildCard.Challenge.util;

import java.util.ArrayList;
import java.util.List;

// 1. Change QueryList to extend ArrayList, removing the items field
public class QueryList<T extends QueryItem> extends ArrayList<T>{
//    public QueryList(List<T> items){
//        super(items);
//    }

    // constructor
//    public QueryList(){
//
//    }
    public QueryList<T> getMatches(String field, String value){
        QueryList<T> matches = new QueryList<>();
        for(var item : this){
            if(item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }

    // static method
//    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value){
//        List<S> matches = new ArrayList<>();
//        for(var item : items){
//            if(item.matchFieldValue(field, value)){
//                matches.add(item);
//            }
//        }
//        return matches;
//    }
}
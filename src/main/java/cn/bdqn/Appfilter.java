package cn.bdqn;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

public class Appfilter {
    public List<Apple> filterFindApple(List<Apple> apples, Appfilter2.Filter filter){
        List<Apple> apples1 = new ArrayList<Apple>();
        for (Apple apple : apples){
            if (filter.filter(apple)){
                apples1.add(apple);
            }
        }
        return apples1;
    }
}

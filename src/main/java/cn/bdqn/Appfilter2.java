package cn.bdqn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appfilter2 {

    public interface Filter{

        boolean filter(Apple apple);
    }


    public  class  GreenAnd150WeightFilter1 implements Filter{
        public  boolean filter(Apple apple){
            return  apple.getColor().equals("green");
        }
    }
    public List<Apple> filterFindApple(List<Apple> apples, Filter filter){
        List<Apple> apples1 = new ArrayList<Apple>();
        for (Apple apple : apples){
            if (filter.filter(apple)){
                apples1.add(apple);
            }
        }
        return apples1;
    }


    @Test
    public void  test(){
        List<Apple> list = Arrays.asList(new Apple("green",150),
                new Apple("yello",120),
                new Apple("green",170));

//        List<Apple> apples = filterFindApple(list,new GreenAnd150WeightFilter1());
//        System.out.println(apples);

//        //匿名内部类
//        List<Apple> apples1 = filterFindApple(list, new Filter() {
//            @Override
//            public boolean filter(Apple apple) {
//                return    apple.getColor().equals("green");
//            }
//        });

        List<Apple> lambdaResult = filterFindApple(list, (Apple apple) -> {
            return apple.getColor().equals("green");
        });

        //简写
        List<Apple> lambdaResult1 = filterFindApple(list, apple -> {
            return apple.getColor().equals("green");
        });
        System.out.println(lambdaResult1);
    }


}

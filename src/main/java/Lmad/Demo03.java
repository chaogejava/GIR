package Lmad;

public class Demo03 {
    interface  IAddition{
        int add(final  int a,final  int b);
    }

    public static void main(String[] args) {
        //全写
        IAddition addition =(final int a,final int b)-> a+b;
        System.out.println(addition.add(23,23));

        //简写
        IAddition aa =((a, b) -> a+b);
        System.out.println(addition.add(22,69));
    }
}

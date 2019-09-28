package Lmad;

public class Demo02 {

    interface  IEat{
        void  eat(String thing);
    }

    interface  ISpeak{
        void  talk(String who,String content);
    }

    interface  IRun{
        int run();
    }
    public static void main(String[] args) {
        //有参无返回
        IEat eat1 =(String thing) -> System.out.println("炸：" +thing);
        eat1.eat("金花");

        //参数数据类型可以省略
        IEat eat2 = (thing) ->System.out.println("炸：" + thing);
        eat2.eat("胡");

        //多个参数
        ISpeak speak1 =((who, content) -> System.out.println(who +"大家" +content));
        speak1.talk("","欢迎 你");

        //返回值
        IRun run1 =() ->{return 10;} ;
       int s = run1.run();
        System.out.println(s);

        //返回值简写
        IRun run2 = () -> 93;
       int v = run2.run();
        System.out.println(v);

    }




}

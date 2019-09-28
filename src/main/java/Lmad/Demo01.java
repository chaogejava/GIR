package Lmad;

public class Demo01 {
    public static void main(String[] args) {
        ICar car1 = new IcarImpl();
        car1.drive();


        ICar car2 =new ICar() {
            @Override
            public void drive() {
                System.out.println("Drive BMW");
            }
        };
        car2.drive();

        ICar car3  =() -> {
            System.out.println("Drive Audi");
        };
        car3.drive();

        ICar car4 =() -> System.out.println("Drive Ferrari");
        car4.drive();
    }

    interface ICar {

        void drive();
    }

    static class IcarImpl implements ICar{

        @Override
        public void drive() {
            System.out.println("Drive Benz");
        }
    }


}

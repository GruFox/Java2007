package lesson1_5;

public class DemoApp {
    public static void main(String[] args){
        Car car = new Car("Dodge", 2020);



        //Car car2 = new Car();
        //Car car3 = car;

        car.info();
        car.printModel();

        car.crash();
        car.info();

        //Car.info(); - нельзя, тк метод на статический
        //car.year = -100;

        String carModel = car.getModel();

        /*Car car2 = new Car();
        car2.model = "Ford";
        car2.year = 1990;
        car2.wheelsNumber = 6;

        System.out.println("Model = " + car2.model + " Year = " + car2.year + " wasCrashed = " + car2.wasCrashed + " wheelsNumber = " + car2.wheelsNumber);
        System.out.println("Model = " + car.model + " Year = " + car.year + " wasCrashed = " + car.wasCrashed + " wheelsNumber = " + car.wheelsNumber);

        int wheelsNumber = Car.wheelsNumber;
        String model = car.model;*/

        //Car[] cars = new Car[]{car, car2};

        //stringpool

        String str = new String("newString");

        Robot[] robots = new Robot[10];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = new Robot("Robot"+i, i+10);
        }
        for(Robot robot : robots){
            robot.info();
        }
    }
}

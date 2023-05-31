package day4.clazz;

public class Class2 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car c1 = new Car();

        System.out.println(c1);
        c1.run();
        c1.run();
        c1.run();


        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car c2 = new Car();
        Car c3 = new Car();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.

        c1.maxVelo = 200;
        c2.maxVelo = 220;
        c3.maxVelo = 180;

        c1.run();
        c2.run();
        c3.run();

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.
    }
}

class Car {
    int maxVelo;

    public void run() {
        System.out.println(maxVelo + "km로 자동차가 달립니다.");
    }

}
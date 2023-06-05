package day7.ConstructorAd;

public class ConstructorChain {
    public static void main(String[] args) {
        // 모든 객체는 생성자를 호출해서 만든다.
        // 생성자 연쇄호출 -> 자식 객체를 만들 때 부모 생성자를 먼저 호출

        // new Animal();   // Animal 생성자 호출
        // new Mammalia(); // Mammalia, Dog 생성자 호출
        new Dog();         // Animal, Mammalia, Dog 생성자 호출
    }
}

class Animal {
    Animal(){
        super(); // 부모 생성자 호출. 생략 가능
        System.out.println("Animal 생성자 실행");
    }
}
class Mammalia extends Animal {
    Mammalia(int age) {
        super(); // 부모 생성자 호출. 생략 가능
        System.out.printf("%d살 Mammalia 생성자 실행\n", age);
    }

    Mammalia(){
        super(); // 부모 생성자 호출. 생략 가능
    }
}

class Dog extends Mammalia {
    Dog() {
        // Dog의 경우 부모클래스에 생성자가 2개 이므로 선택을 해줘야 한다.
        // super(); // 매개변수가 없는 생성자를 선택
        super(1); // 매개변수가 있는 생성자를 선택

        //결과적으로 부모생성자를 호출할 때, 부모 생성자 오버로딩에 유의한다.
        System.out.println("Dog 생성자 실행");
    }
}
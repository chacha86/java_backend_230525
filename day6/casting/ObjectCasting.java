package day6.casting;

public class ObjectCasting {
    public static void main(String[] args) {

        // 객체 형변환
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        //Dog d2 = new Cat();

        // 객체 형변환
        Animal a1 = new Dog(); // Dog가 Animal변수에 저장 X. Dog가 Animal로 자동 형변환
        Dog d3 = (Dog)a1; // Animal이 Dog로 수동 형변환
        // Dog d4 = (Dog)c1; // 형변환은 부모 자식 간에만 가능



    }
}

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}

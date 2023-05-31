package day4.clazz;

// 클래스이름은 파스칼 표기법
public class Class1 {

    // 이름 짓는 법 -> 카멜표기법, 파스칼 표기법

    // 메서드, 변수 -> 카멜표기법
    public static void printPersonInfo(int age, int height, int weight) {
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }

    public static void printPersonInfo2(int[] person) {
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
    }
    public static void main(String[] args) {

        // 정보 3개 -> 나이, 키, 몸무게

        // 1. 그냥
        System.out.println(20);
        System.out.println(170);
        System.out.println(60);


        // 2. 변수 사용
        int age = 20;
        int height = 170;
        int weight = 60;

        int age2 = 30;
        int height2 = 160;
        int weight2 = 58;

//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(weight);

        printPersonInfo(age, height, weight);
        printPersonInfo(age2, height, weight2);

        // 3. 배열 사용
        int[] person1 = {20, 170, 60};
        int[] person2 = {30, 160, 58};

        printPersonInfo2(person1);
        printPersonInfo2(person2);

        // 4. 클래스 사용해서 객체 만들기 -> 내가 표현하고자 하는 대상을 정의해서 자바한테 알려주기
        // 사용자 전용 배열 만들기

        // 개발자1이 생각한 사람
        String name3 = "홍길동";
        String address = "서울";
        double height3 = 176.9;

        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;

        // 클래스를 이용해 객체 만들기
        Person hong1 = new Person();

        hong1.name = "홍길동";
        hong1.address = "서울";
        hong1.height = 176.9;

        System.out.println(hong1.name);
        System.out.println(hong1.address);
        System.out.println(hong1.height);


        // 개발자2가 생각한 사람
//        String name4 = "홍길동";
//        int age4 = 20;
//        double height4 = 176.9;




    }
}

class Person {
    String name; // 사람 이름
    String address; // 사람 주소
    double height; // 사람 키
}
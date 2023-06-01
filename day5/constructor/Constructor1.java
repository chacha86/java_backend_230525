package day5.constructor;

public class Constructor1 {
    public static void main(String[] args) {

        // 객체를 만들면 반드시!!!!!!!!!! 데이터를 넣어줘야 한다.(초기화)

        //객체 초기화
        // 1. 객체 초기화 불편. 귀찮.
        // 2. 초기화를 까먹는다.

        // 저 위에 두개 해결하려고 생성자를 사용한다.
        // 아래 방식은 불편하고 초기화 과정이 누락될 수 있음.
        // Person p1 = new Person();
        // p1.no = 1;
        // p1.age = 20;
        // p1.name = "홍길동";

        // 아래처럼 생성자를 이용한 초기화 방식은 간편하고 누락될 염려가 없음.
        Person p1 = new Person(1, 20, "홍길동");
        Person p2 = new Person(2, 30, "홍길순");

        p1.introduce();
        p2.introduce();


    }
}

class Person {
    int no;
    int age;
    String name;

    // 생성자 -> 메서드(함수)의 일종
    // 1. 리턴 타입 X
    // 2. 메서드이름을 꼭! 클래스명과 동일하게 지어야 함.
    // 3. 이 메서드는 반드시 실행됨.

    public Person(int a, int b, String c) {
        System.out.println("사람이 한명 생성됨.");
        System.out.println("번호 : " + a);
        System.out.println("나이 : " + b);
        System.out.println("이름 : " + c);
        no = a;
        age = b;
        name = c;
    }

    // 처리
    public void introduce() {
        System.out.printf("안녕하세요 %d번, %d살 %s입니다.\n", no, age, name);
    }
}

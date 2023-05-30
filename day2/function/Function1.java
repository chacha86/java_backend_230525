package day2.function;

public class Function1 {

    // 함수 생성 방법 -> 리턴이 없는 경우
    public static void test() {
        System.out.println("코드1");
        System.out.println("코드2");
    }

    // 함수 생성 방법 -> 리턴이 있는 경우
    public static int test2() {
        return 10;
    }

    // 매개변수와 리턴이 모두 있는 경우
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // main 함수
    public static void main(String[] args) {

        // 변수 -> 동일한 값을 재사용
        int a = 10;
        System.out.println(a);

        // 함수 -> 동일한 코드를 재사용
        test(); // 메서드 호출

        // 리턴 -> 함수가 값이 된다.
        //int b = test(); // return이 없기 때문에 불가능
        //int c = test2(); // return이 10이기 때문에 10으로 역할 가능

        int b = add(1, 2); // 1, 2가 add 함수의 매개변수 a, b로 저장되어 사용됨, a + b가 리턴값이기 때문에 함수는 a + b의 값으로 역할 가능

        int s = test2();
    }
}


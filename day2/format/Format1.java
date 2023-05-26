package day2.format;

public class Format1 {
    public static void main(String[] args) {
        // 문자열 결합 -> 문자열1 + 문자열2
        System.out.println("10" + "10");

        // 문자 + 숫자 -> 숫자를 문자로 바꿔서 문자열 결합

        System.out.println(10 + "10");

        int age = 22;
        String name = "홍길순";

        System.out.println(age + "살 " + name + "입니다.");
        System.out.println(age + "살 " + name + "입니다.");
        System.out.println(age + "살 " + name + "입니다.");

        // 일반적인 방법
        //String message = String.format("%d살 %s입니다.", age, name);
        //System.out.println(message);

        // 편한 방법
        // 단 줄바꿈이 안되기 때문에 줄바꿈 문자 \n을 이용해 직접 줄을 바꿔야 함.
        System.out.printf("%d살 %s입니다.\n", age, name);
        System.out.printf("%d살 %s입니다.\n", age, name);

    }
}

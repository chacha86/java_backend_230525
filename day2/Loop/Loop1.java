package day2.Loop;

public class Loop1 {

    public static void main(String[] args) {


        // 반복문 사용 안한 코드
        System.out.println("코드1");
        System.out.println("코드2");

        System.out.println("코드1");
        System.out.println("코드2");

        System.out.println("코드1");
        System.out.println("코드2");

        System.out.println("코드1");
        System.out.println("코드2");

        // while, for
//        while(true) {
//            System.out.println("코드1");
//            System.out.println("코드2");
//        }


        int i = 1; // 조건 변수 초기화

        while (i <= 5) { // 반복 조건

            System.out.println(i);
            i++;  // i = i + 1   // 조건변수제어

        }

        // for
        for (int i2 = 1; i2 <= 5; i2++) {
            System.out.println(i2);
        }

    }

}

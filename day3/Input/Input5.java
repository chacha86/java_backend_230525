package day3.Input;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Input5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)
        System.out.printf("원하는 단을 입력해주세요 : ");
        int dan = scan.nextInt();

        // 4단 출력.
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        }
    }
}

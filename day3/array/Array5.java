package day3.array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        // 배열을 이용해 5개의 문장을 입력받고 출력해주세요.
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = scan.next();
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

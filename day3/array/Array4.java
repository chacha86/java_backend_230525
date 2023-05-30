package day3.array;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < 5; i++ ) {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

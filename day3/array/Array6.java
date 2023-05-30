package day3.array;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 4; i >= 0; i--) {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

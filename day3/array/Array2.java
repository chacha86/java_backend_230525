package day3.array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.


        // 직접 초기화해서 출력
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for(int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }

        // scanner를 사용해서 출력

        int[] arr2 = new int[10];

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

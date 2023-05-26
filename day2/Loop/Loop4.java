package day2.Loop;

public class Loop4 {
    public static void main(String[] args) {

        // 2단
        for(int i = 1; i <= 9; i++) {
            System.out.printf("2 X %d = %d\n", i, 2 * i);
        }

        // 2중 반복문 이용해서 2 ~ 9단까지 구구단 만들기
        // j = 2, i = 1, 2 X 1 = 2
        // j = 2, i = 2, 2 X 2 = 4
        // j = 2, i = 3, 2 X 3 = 6
        // ....

        for(int j = 2; j < 10; j++) {
            for(int i = 1; i <= 9; i++) {
                System.out.printf("%d X %d = %d\n",j , i, j * i);
            }
        }

    }
}

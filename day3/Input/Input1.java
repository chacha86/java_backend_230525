package day3.Input;

import java.io.IOException;

public class Input1 {
    public static void main(String[] args) {
        try {

            // 표준 입력
            int num = System.in.read();
            System.out.println("출력 : " + num);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

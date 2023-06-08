package day8.exception1;

public class Exception1 {
    public static void main(String[] args) {

    }

     public static void test() {

         // 예외
         int [] arr = new int[2];

         // 예외 상황을 염두에 두고 처리 -> 예외 처리
         try {
             // 예외가 발생할 만한 코드
             arr[0] = 1;
             arr[1] = 2;
             arr[2] = 3;
         }
         catch(ArrayIndexOutOfBoundsException e1) {

         }

     }
}

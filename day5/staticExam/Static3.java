package day5.staticExam;

public class Static3 {
    static int num = 10;

    public static void printValue(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
}

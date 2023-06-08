package day8.generic;

public class Wrapper1 {
    public static void main(String[] args) {

        사람 a사람 = new 사람();

        int i = 10;

        Object o = a사람;
        o = i; // 10이 그냥 들어가는게 아니고 객체화 돼서 들어간다.

        // int의 래퍼클래스
        Integer io = Integer.valueOf(10);

        // double의 래퍼클래스
        Double o2 = Double.valueOf(10.1);

        o = io; // 이게 맞다





    }
}

package day7.ConstructorAd;

public class Overloading1 {
    public static void main(String[] args) {

        사람 p1 = new 사람();

        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람());
        저장소.저장(new 사과());
        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a'); // '단일문자' char
//
//        // 정수 계열
        byte b = 0; // 1바이트
        char c = 1; // 2바이트
        short s = 2; // 2바이트
        int i = 3; // 4바이트
        long l = 4; // 8바이트
//
//        // 실수 계열
//        // 4.1f => float 형 실수를 의미
        float f = 3.14f; // 4바이트
//        // 3.141592 => double 형 실수를 의미
        double d = 3.141592; // 8 바이트
//
//        // 논리 계열
//        boolean bl = false; // 1/8 바이트, 1비트
//
        저장소.저장(b);
        저장소.저장(s);
        저장소.저장(c);
        저장소.저장(i);
        저장소.저장(l);
        저장소.저장(f);
        저장소.저장(d);
//        저장소.저장(bl);
    }
}

class 저장소 {

    static void 저장(String v) {

    }

    static void 저장(double v) {

    }

    static void 저장(boolean v) {

    }

    static void 저장(char v) {

    }

    static void 저장(사람 v) {

    }

    static void 저장(사과 v) {

    }

}

class 사과 {

}
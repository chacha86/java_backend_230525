package day7.ConstructorAd;

public class ConstructorAdvance {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);


        사람 a사람 = new 사람(1, 20, "홍길동");
        a사람.자기소개();
        a사람.자기소개(1);
        a사람.자기소개("aa");

        // 사람 만들기 버전2
        //사람2 b사람 = new 사람2(2); // 두번째 사람의 나이와 이름을 아직 모르는 경우

        // 사람을 생성하는 경우의 수가 여러가지일 때
        //사람3 b사람 = new 사람3(3, 23); // 두번째 사람의 나이와 이름을 아직 모르는 경우

    }
}

class 사람 {
    int 번호;
    int 나이;
    String 이름;

//    사람(int 번호, int 나이, String 이름) {
//        this.번호 = 번호;
//    }

    // 같은 이름으로 메서드나 생성자를 여러개 만드는 것 -> 오버로딩
    public 사람() {}

    public 사람(int 번호) {
        this.번호 = 번호;
    }



    public 사람(int 번호, int 나이, String 이름) {
        this.번호 = 번호;
        this.나이 = 나이;
        this.이름 = 이름;
    }

    void 자기소개() {
        System.out.printf("%d살 %s입니다.\n", 나이, 이름);
    }

    void 자기소개(int a) {
        System.out.printf("안녕!!\n", 나이, 이름);
    }

    void 자기소개(String 이름) {
        System.out.printf("하하하하하!!\n", 나이, 이름);
    }
}

class 계산기 {
    int 더하기(int num1, int num2) {
        return num1 + num2;
    }

    int 더하기(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
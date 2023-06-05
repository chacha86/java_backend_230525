package day7.ConstructorAd.constructorAndOverride;

public class constructorAndOverride {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 초기화 됩니다.
    }
}

class 동물 {
    // 수정가능지역 시작
    동물() {
        init();
    }
    // 수정가능지역 끝
    void init() {}
}

class 사람 extends 동물 {
    사람() {
        super();
    }
    void init() {
        System.out.println("사람이 초기화 됩니다.");
    }
}
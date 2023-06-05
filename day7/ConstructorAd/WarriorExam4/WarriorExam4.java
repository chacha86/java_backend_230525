package day7.ConstructorAd.WarriorExam4;

public class WarriorExam4 {
    public static void main(String[] args) {
        광전사 a광전사 = new 광전사();
        a광전사.공격(); // 칼로 공격

        성전사 a성전사 = new 성전사();
        a성전사.공격(); // 칼로 공격

        요정전사 a요정전사 = new 요정전사();
        a요정전사.공격(); // 활로 공격

        난쟁이전사 a난쟁이전사 = new 난쟁이전사();
        a난쟁이전사.공격(); // 활로 공격
    }
}

class 전사 {
}

class 광전사 extends 전사 {
    무기 a무기;

    광전사() {
        a무기 = new 칼();
    }

    void 공격() {
        a무기.작동();
    }
}

class 성전사 extends 전사 {
    무기 a무기;

    성전사() {
        a무기 = new 칼();
    }

    void 공격() {
        a무기.작동();
    }
}

class 요정전사 extends 전사 {
    무기 a무기;

    요정전사() {
        a무기 = new 활();
    }

    void 공격() {
        a무기.작동();
    }
}

class 난쟁이전사 extends 전사 {
    무기 a무기;

    난쟁이전사() {
        a무기 = new 활();
    }

    void 공격() {
        a무기.작동();
    }
}

class 무기 {
    void 작동() {}
}

class 칼 extends 무기 {
    void 작동() {
        System.out.println("칼로 공격");
    }
}

class 활 extends 무기 {
    void 작동() {
        System.out.println("활로 공격");
    }
}
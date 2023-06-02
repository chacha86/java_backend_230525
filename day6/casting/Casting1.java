package day6.casting;

public class Casting1 {
    public static void main(String[] args) {

        int a = 10;

        // 다형성
        Weapon aweapon = new Sword();
        aweapon.attack();
        // 출력 : 칼로 공격합니다.

        aweapon = new Bow();
        aweapon.attack();
//        // 출력 : 활로 공격합니다.

    }
}

class Weapon {
    void attack() {

    }
}

class Sword extends Weapon {
    void slash() {

    }

    void attack() {
        System.out.println("칼로 공격");
    }
}
class Bow extends Weapon {
    void attack() {
        System.out.println("활로 공격");
    }
}

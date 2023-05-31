package day4.clazz;

public class Class3 {
    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        // =====================================================
        // 여기에 w2 세팅
        Warrior w2 = new Warrior();
        w2.name = "강감찬";
        w2.attack = 15;
        w2.defense = 15;
        // =====================================================

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.

    }
}
class Warrior {
    String name;
    int attack;
    int defense;

    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙민다.\n", name, attack);
    }
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d\n", name, attack, defense);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다.\n", name, defense);
    }
}
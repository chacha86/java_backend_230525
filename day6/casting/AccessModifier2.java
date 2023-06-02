package day6.casting;

public class AccessModifier2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작
        //p1.id = 20;

        // 메서드를 통해서 접근한다. -> 메서드에서는 처리가 가능
        //p1.printId();
        p1.setId(20);
        int id = p1.getId();
        System.out.printf("제 번호는 %d 입니다.", id);
        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}
class Person {

    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.

    // 세터
    public void setId(int id) {
        this.id = id;
    }

//    public void printId() {
//        System.out.printf("제 번호는 %d입니다.\n", this.id);
//    }

    // 게터
    public int getId() {
        return this.id;
    }

}
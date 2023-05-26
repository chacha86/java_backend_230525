package day1.Condition;

public class Condition2 {
    public static void main(String[] args) {

        // 문제 : 할인 대상인지 아닌지 출력해주세요.
        // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
        // 조건 : 출력예시 처럼 출력되어야 합니다.
        // 조건 : `구현시작` 부분만 수정 할 수 있습니다..
        // 조건 : 2가지 이상의 방법으로 풀어야 합니다.
        
        int age = 7; // 이 값을 바꿔가면서 실행해보세요.
        System.out.println("당신의 나이는 " + age + "살 입니다.");


        // 할인 대상 이거나 할인 대상 X  -> 양자택일(남녀, 성인여부)
        if(age < 19 || age >= 60) {
            System.out.println("할인 대상");
        }
        else {
            System.out.println("할인 대상 아님");
        }

        // 양자택일 -> 삼자택일 -> 사자택일 -> 다자택일
        // 학적, 성적등급

        int age2 = 14;

        if(age2 <= 13) {
            System.out.println("초등학생");
        }
        else if(age2 <= 16) {
            System.out.println("중학생");
        }
        else if(age2 <= 19) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("대학생");
        }














        // 구현시작

        // if문만 이용해서 풀기
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }
}

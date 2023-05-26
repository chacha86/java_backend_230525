package day1.Condition;

public class Condition1 {
    public static void main(String[] args) {

        // 실행이 될 때도 있고 안될 때도 있다. -> if(조건문)

        System.out.println("코드1");

        // 만약 변수 a의 값이 1이면
        int a = 2;

        if(a == 1) {
            System.out.println("코드2");
            System.out.println("코드3");
        }

        System.out.println("코드4");

        // 날씨에 따른 인삿말.
        // 1. 비  2. 맑음  3. 미세먼지
        int weather = 3;

        if(weather == 2) {
            System.out.println("안녕하세요. 날씨가 맑군요. 나들이 나가세요.");
        }

        if(weather == 1) {
            System.out.println("안녕하세요. 비가 많이 오네요. 우산 챙겨나가세요.");
        }

        if(weather == 3) {
            System.out.println("안녕하세요. 오늘은 미세먼지가 심합니다. 마스크 꼭 쓰세요.");
        }

        // 소지금에 따른 야식 메뉴.

        // 소지금이 10000원 이상이면 치킨, 10000원 미만이면 라면

        int money = 19000;


        if(money < 10000) {
            System.out.println("라면");
        }
        if(money >= 10000) {
            System.out.println("치킨");
        }



    }
}

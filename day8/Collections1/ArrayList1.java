package day8.Collections1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        arr[0] = 100;

        // 추가, 수정, 삭제, 조회, 사이즈
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 추가 - add
        // add한번에 값 하나
        list.add(10);
        list.add(11);

        // 조회 - get, 인덱싱
        System.out.println(arr[0]);
        System.out.println(list.get(0));

        // 수정 - set(위치, 값)
        // arr[0] = 200;
        list.set(0, 20);

        System.out.println(list.get(0));

        // 삭제 - remove(값), remove(위치)
        // 하나 삭제하면 뒤에 있는 애들이 땡겨진다.
        list.remove(0); // 위치(인덱스)
        list.remove(Integer.valueOf(20)); //값(오브젝트)

        System.out.println(list.get(0));

        // 사이즈
        System.out.println(arr.length);
        System.out.println(list.size());

        list.add(20);
        list.add(30);

        System.out.println(list.size());

        // 순회
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for( int num : list) {
            System.out.println(num);
        }
    }
}

package day8.generic;

public class Generic1 {
    public static void main(String[] args) {
        Int저장소 a저장소1 = new Int저장소();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        Double저장소 a저장소2 = new Double저장소();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);

        사과저장소 a저장소3 = new 사과저장소();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();
        System.out.println(c);

        // 아래처럼 Object로 받아서 모든 타입을 저장하는 방식 X
        // 타입을 정해놓고 사용하는게 좋다.
        My저장소<Integer> a저장소4 = new My저장소<Integer>();
        a저장소4.setData(10);

        My저장소<Double> a저장소5 = new My저장소<Double>();
        a저장소5.setData(5.5);

        My저장소<사과> a저장소6 = new My저장소<사과>();
        a저장소6.setData(new 사과());

        //a저장소4.setData(new 사과());

        Integer d = a저장소4.getData();
        Double e = a저장소5.getData();
        사과 f = a저장소6.getData();

    }
}

class My저장소<T> {
    T data;

    void setData(T o) {
        this.data = o;
    }

    T getData() {
        return (T)this.data;
    }
}

class Int저장소 {
    Object data;

    int getData() {
        return (int)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class Double저장소 {
    Object data;

    double getData() {
        return (double)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class 사과저장소 {
    Object data;

    사과 getData() {
        return (사과)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}


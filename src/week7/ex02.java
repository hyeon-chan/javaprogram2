package week7;

class Parent1 {
    void method1() {
        System.out.println("Method1의 출력");
    }

    void method2() {
        System.out.println("Method2의 출력");
    }
}

class Child1 extends Parent1 {
    void method2() {
        System.out.println("Method2의 재정의");
    }

    void method3() {
        System.out.println("Method3의 출력");
    }
}

public class ex02 {
    public static void main(String[] args) {
        Child1 child = new Child1();
        Parent1 parent = child;  

        parent.method1();
        parent.method2();
        // parent.method3();
    }
}

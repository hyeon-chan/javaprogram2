package week7;

class Parent2 {
    String field1;

    void method1() {
        System.out.println("Method1의 출력");
    }

    void method2() {
        System.out.println("Method2의 출력");
    }
}

class Child2 extends Parent2 {
    String field2;

    void method2() {
        System.out.println("Method2의 재정의");
    }

    void method3() {
        System.out.println("Method3의 출력");
    }
}

public class ex03 {
    public static void main(String[] args) {
        Parent2 parent = new Child2();

        parent.field1 = "xxx";
        parent.method1();
        parent.method2();
        // parent.field2 = "yyy"; 
        // parent.method3();     

        Child2 child = (Child2) parent;
        child.field2 = "yyy";
        child.method3();
    }
}

package week13_2;

public class Box {
    private Object data;

    public void set(Object data) {
        this.data = data;
    }

    public Object get() {
        return data;
    }

    public static void main(String[] args) {
        Box b = new Box();

        b.set("Hello World!");            // ① 문자열 객체 저장
        String s = (String)b.get();       // ② Object → String 형변환
        System.out.println("s = " + s);

        b.set(new Integer(10));           // ③ 정수 객체 저장
        Integer i1 = (Integer)b.get();    // ④ Object → Integer 형변환
        System.out.println("i1 = " + i1);

        // 잘못된 형변환 예시
        b.set("Hello World!");
        try {
            Integer i2 = (Integer)b.get();   // 오류! 문자열을 정수로 형변환
            System.out.println(i2);
        } catch (ClassCastException e) {
            System.out.println("오류 발생: " + e);
        }
    }
}

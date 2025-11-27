package week13_2;

public class GenericTest {

    static class Box<T> {
        private T data;

        public void set(T data) {
            this.data = data;
        }

        public T get() {
            return data;
        }
    }

    public static void main(String[] args) {

        Box<String> b = new Box<String>();
        b.set("Hello World!");    
        String s = b.get();    
        System.out.println("s = " + s);

        Box<String> stringBox = new Box<String>();

        stringBox.set("Java");
        System.out.println("stringBox = " + stringBox.get());
    }
}

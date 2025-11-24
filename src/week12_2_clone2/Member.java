package week12_2_clone2;

import java.util.Arrays;

public class Member implements Cloneable {
    public String name;
    public int[] scores;
    public Car car;

    public Member(String name, int[] scores, Car car) {
        this.name = name;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 먼저 얕은 복사를 해서 name을 복제한다.
        Member cloned = (Member) super.clone();

        // scores 배열을 깊은 복제한다.
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

        // car를 깊은 복제한다.
        cloned.car = new Car(this.car.model);

        // 깊은 복제된 Member 객체를 리턴
        return cloned;
    }
}

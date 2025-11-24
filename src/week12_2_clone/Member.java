package week12_2_clone;

public class Member implements Cloneable {
    public String name;

    public Member(String name) {
        this.name = name;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}

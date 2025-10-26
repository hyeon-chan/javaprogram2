package hard;

class Animal {
    public void sound() {
        System.out.println("동물 합창단");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.print("강아지가 노래를 합니다 : ");
    }

    public void dogsound() {
        System.out.println("Dog Dog Dog...");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.print("고양이가 노래를 합니다 : ");
    }

    public void catsound() {
        System.out.println("Cat Cat Cat...");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        // instanceof를 사용하여 객체가 특정 클래스의 인스턴스인지 확인
        if (dog instanceof Dog) {
            Dog specificDog = (Dog) dog; // 형 변환
            specificDog.sound(); // Dog 클래스의 메서드 호출
            specificDog.dogsound(); // Dog 클래스 메서드 호출
        }

        if (cat instanceof Cat) {
            Cat specificCat = (Cat) cat; // 형 변환
            specificCat.sound(); // Cat 클래스의 메서드 호출
            specificCat.catsound(); // Cat 클래스 메서드 호출
        }
    }
}

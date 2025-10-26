package week5;

public class Data {
    private String name;
    private int score1, score2;
    
    public Data(String name, int score1, int score2) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
    }

    public Data() {
        this.name = "홍길동";
        this.score1 = 100;
        this.score2 = 100;
    }

    public Data(String name) {
        this.name = name;
        this.score1 = 100;
        this.score2 = 100;
    }

    public Data(String name, int score1) {
        this.name = name;
        this.score1 = score1;
        this.score2 = 100;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore1() {
        return score1;
    }
    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public int getScore2() {
        return score2;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }
    public void setNums(int score1, int score2) {
    	this.score1 = score1;
    	this.score2 = score2;
  
    }
}
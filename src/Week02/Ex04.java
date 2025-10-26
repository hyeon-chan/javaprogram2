package Week02;

public class Ex04 {
		String name;          
        int score;
        
        void input(String[] args) {
        	name = args[0];
        	score = Integer.parseInt(args[1]);
        }
        
        void print() {
        	System.out.println("입력하신 데이터는 " + name + ", " + score + " 입니다.");
	}
        
        public static void main(String[] args) {
        	Ex04 n = new Ex04();
        	
        	n.input(args);
        	n.print();
        }
}

package hard;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ex = new StringBuffer("Java");

        ex.append("Programming2");     
        ex.insert(4, "지현찬");     
        ex.delete(0, 4);                
        ex.replace(0, 9, "20255284");      
        ex.reverse();                   

        System.out.println("최종 결과: " + ex);
	}

}

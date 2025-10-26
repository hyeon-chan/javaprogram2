package week4;

class ArrObject {
	int arr[];
	
	public ArrObject() {
		this.arr = new int[]{10, 20, 30, 40, 50};
	}
	
	public ArrObject(int[] arr) {
	        this.arr = arr;
	    }
	 
	void print() {
		for (int num : arr) {
            System.out.print(num + " ");
        }
		System.out.println();
		System.out.println();
}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrObject k = new ArrObject();
		
		k.print();
		
		k = new ArrObject(new int[] {100, 200, 300});
		k.print();
		
		new ArrObject(new int[] {1, 2, 3}).print();
	}

}

package week10;

abstract class ex10abs {
	abstract void Uarray();
	abstract void print();
}

public class ex10 extends ex10abs{
	int[] arr;
	int temp;
	
	public ex10() {
		arr = new int[] {99, 2, 30, 77, 15, 45, 37};
	}
	public void Uarray() {
		System.out.println("오름차순 정렬");
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j] < arr[i]) {
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
	public void print() {
		System.out.print("배열에 저장된 데이터: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.printf("%d\n", arr[i]);
			else
				System.out.printf("%d, ", arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex10 k = new ex10();
		k.print();
		k.Uarray();
		k.print();
	}

}

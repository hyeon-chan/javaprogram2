package week8;

abstract class abs {
	abstract void baseprint();
	abstract void Uarray();
	abstract void print();
}

public class ex03 extends abs{
	int[] arr;
	int sum = 0;
	int temp;
	public ex03() {
		arr = new int[] {10, 30, 5, 9, 11};
	}
	public void baseprint() {
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d]:%d, ", i, arr[i]);
			sum += arr[i];
		}
		System.out.printf("sum: %d점 }", sum);
	}
	public void Uarray() {
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
		System.out.print("\n오름차순 정렬: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.printf("%d", arr[i]);
			else
				System.out.printf("%d, ", arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex03 n = new ex03();
		n.baseprint();
		n.Uarray();
		n.print();
	}

}

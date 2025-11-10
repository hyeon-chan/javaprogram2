package week3;

abstract class AppExBase3{
	int[] data;

	void basePrint() {
		System.out.print("기본데이터 : ");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();

	}
	
	abstract void forEachPrint(String msg);
	abstract void eArray();
}

public class Ex08 extends AppExBase3 {


	public Ex08() {
		data = new int[] {10, 40, 50, 90, 100, 45, 76, 15, 3, 55};
	}



	public void forEachPrint(String msg) {
		System.out.print(msg);
		for(int n:data)
			System.out.print(n + " ");
		System.out.println();
	}

  
	public void eArray() {
		for(int i=0; i<data.length; i++)
		{
			for(int j=i+1; j<data.length;j++)
			{
				int temp;
				if(data[i] > data[j])
				{
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 k = new Ex08();

		k.basePrint();
		k.forEachPrint("for each 적용 데이터 : ");

		k.eArray();

		k.forEachPrint("오름차순 데이터 : ");
	}
}
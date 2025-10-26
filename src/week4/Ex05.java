package week4;

abstract class AppExBase{
	int[] data;
	
	abstract void Print(String msg);
	abstract void eArray();
}

public class Ex05 extends AppExBase {


	public Ex05() {
		data = new int[] {10, 30, 25, 5, 50, 20};
		Print("기본데이터 출력: ");
	}
	public void Print(String msg) {
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
		Ex05 k = new Ex05();

		k.Print("배열에 저장된 데이터 : ");

		k.eArray();

		k.Print("오름차순 데이터 : ");
	}
}

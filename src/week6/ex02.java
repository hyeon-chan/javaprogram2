package week6;

abstract class ex02inter {
	int[] data;
	abstract void array();
	abstract void print(String msg);
}
public class ex02 extends ex02inter {
	public ex02() {
		data = new int[] {10, 30, 25, 5, 50, 20};
	}
	public void array() {
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
	
	public void print(String msg) {
		System.out.print(msg);
		for(int n:data)
			System.out.print(n + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02 k = new ex02();
		k.array();
		k.print("오름차순 정렬된 데이터: ");
	}

}

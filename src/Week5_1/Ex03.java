package Week5_1;
import java.util.Arrays;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ex = {5, 3, 8, 1, 9};

        Arrays.sort(ex); 
        System.out.println("정렬한 배열: " + Arrays.toString(ex));

        int index = Arrays.binarySearch(ex, 8); 
        System.out.println("숫자 8 위치: " + index);

        int[] copy = Arrays.copyOf(ex, 3); 
        System.out.println("복사한 배열: " + Arrays.toString(copy));
    }
}
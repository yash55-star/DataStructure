import java.util.Scanner;

/**
 * @author Yash.Divecha
 * add into notes
 */
public class Swap_alternate {

	public static void swapAlternate(int arr[]) {
		
		
		int[] swap_array = new int[arr.length];
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(i==arr.length-1)
				break;
			int left = arr[i];
			int right = arr[i+1];
			arr[i] = right;
			arr[i+1] = left;
			i++;
		}
    }

	public static void main(String[] args) {
		int arr[] = { 1 ,2 ,3, 4 ,5 ,6 ,7 ,8 ,9 ,10, 11 };
		Swap_alternate.swapAlternate(arr);
		
	}

}

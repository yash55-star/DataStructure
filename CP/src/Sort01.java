/**
 * @author Yash.Divecha add into notes
 */
public class Sort01 {

	public static void sortZeroesAndOne(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (arr[left] == 1 && arr[right] == 0) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			} else if (arr[left] == 0) {
				left++;
			} else if (arr[right] == 1) {
				right--;
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1 };
		Sort01.sortZeroesAndOne(arr);
		System.out.println();
	}

}

/**
 * @author Yash.Divecha add into notes
 */
public class UniqueElement {

	public static int findUnique(int[] arr) {

		int uniqueElement = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			uniqueElement = arr[i];
			for (int j = 0; j < arr.length; j++) {

				if (i == j)
					continue;
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}

			}

			if (!flag) {
				break;
			}

		}

		return uniqueElement;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 3, 4 };
		UniqueElement.findUnique(arr);

	}

}

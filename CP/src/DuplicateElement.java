/**
 * @author Yash.Divecha add into notes
 */
public class DuplicateElement {

	public static int findDuplicate(int[] arr) {

		int duplicateElement = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			duplicateElement = arr[i];
			for (int j = 0; j < arr.length; j++) {

				if (i == j)
					continue;
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}

			}

			if (flag) {
				break;
			}

		}

		return duplicateElement;
	}

	public static void main(String[] args) {
		int arr[] = { 0 ,3 ,1 ,5 ,4 ,3 ,2 };
		System.out.println(DuplicateElement.findDuplicate(arr));

	}

}

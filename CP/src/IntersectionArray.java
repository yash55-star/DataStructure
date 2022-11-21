import java.util.Arrays;

/**
 * @author Yash.Divecha add into notes
 */
public class IntersectionArray {

	 public static void intersections(int arr1[], int arr2[]) {
	    	
		 
		Arrays.sort(arr1);
		 
		 for(int i =0 ; i<arr1.length;i++)
		 {
			 for(int j =0 ; j<arr2.length;j++)
			 {
				 if(arr1[i]==arr2[j])
				 {
					 arr2[j] = Integer.MIN_VALUE;
					 System.out.print(arr1[i]+" ");
					 break;
				 }
			 }
		 }
		 
		 
	    }

	public static void main(String[] args) {
		int arr1[] = { 1 ,0 ,1 ,1 ,0 ,1 ,0 ,1};
		int arr2[] = { 1, 2 ,3 ,4, 2 };
		IntersectionArray.intersections(arr1,arr2);

	}

}

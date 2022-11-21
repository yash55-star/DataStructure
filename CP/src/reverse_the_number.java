import java.util.Scanner;

/**
 * @author Yash.Divecha
 * add into notes
 */
public class reverse_the_number {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev =0;
		
		for(int i=1;;i++)
		{
			int last = n%10;
			int remain = n/10;
			rev = rev*10+last;
			
			if(remain==0)
			{
				break;
			}
			n = remain;
			
		}
		System.out.println(rev);
		
	}

}

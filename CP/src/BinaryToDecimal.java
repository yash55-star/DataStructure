import java.util.Scanner;

/**
 * @author Yash.Divecha
 * add into notes
 */
public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i=0;;i++)
		{
			
			int last = n%10;
			int remain = n/10;
			int p = 1;
			for(int k=1;k<=i;k++)
			{
				p *= 2; // 2^n
			}
			result += p*last;
			if(remain == 0)
			{
				break;
			}
			n=remain;
		}
		System.out.println(result);
		
	}

}

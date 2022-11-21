import java.util.Scanner;

/**
 * @author Yash.Divecha
 * add into notes
 */
public class DecomalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int i =0;
		while(n>0)
		{
			
			
			int p = 1;
			for(int k=1;k<=i;k++)
			{
				p *= 10; // 2^n
			}
			
			int reminder = n%2;
			n = n/2;
			result = result + reminder * p;
			i++;
		}
		System.out.println(result);
		sc.close();
	}

}

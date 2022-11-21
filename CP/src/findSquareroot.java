import java.util.Scanner;

/**
 * @author Yash.Divecha
 * add into notes
 */
public class findSquareroot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int i =0;
		while(n>1)
		{
			
			n = n/2;
			i++;
		}
		System.out.println(i);
		sc.close();
	}

}

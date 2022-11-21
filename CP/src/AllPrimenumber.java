import java.util.Scanner;

/**
 * @author Yash.Divecha add into notes
 */
public class AllPrimenumber {
	
	static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
 
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		System.out.println(2);
		for (int i = 2; i < n; i++) {
			
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

}

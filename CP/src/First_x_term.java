import java.util.Scanner;

public class First_x_term {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int counter = 1;
		for (int i = 1;; i++) {
			int c = (3 * i + 2);
			if (c % 4 != 0) {
				System.out.print(c + " ");
				if(counter == n)
				{
					break;
				}
				counter++;
			}
			
		}
	}

}

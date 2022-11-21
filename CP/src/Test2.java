import java.util.Scanner;

public class Test2 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.next();
		
		//String[] numbers = n2.split(" ");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		int average = (a1+a2+a3)/3;
		
		System.out.println(n1);
		System.out.println(average);
		
	}

}

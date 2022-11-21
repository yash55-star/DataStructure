import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		 
        // String input
        int size = sc.nextInt();
        
        
        
        int i = 1 ; 
        
        while(i<=size)
        {
        	int j= 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			 
        	System.out.println();
        	
        	i++;
        }
        
        
        
		
		
	}

}

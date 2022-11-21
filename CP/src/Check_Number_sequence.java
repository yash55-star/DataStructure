import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Yash.Divecha
 * add into notes
 */
public class Check_Number_sequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		String input = sc.nextLine();    // get the entire line after the prompt 
		String[] numbers = input.split("\\r?\\n"); 
		
		boolean isdesc = false;
		boolean isasc= false;
		for(int i=1;i<list.size();i++)
		{
			System.out.println("test" + list.get(i));
		}
		
		
		sc.close();
	}

}

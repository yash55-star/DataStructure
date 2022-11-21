import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.next();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);list.add(7);list.add(11);list.add(13);
		ArrayList<String> answer = new ArrayList<>();
		
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)+list.get(j) == 6)
				{
					answer.add(list.get(i)+" "+list.get(j));
				}
			}
		}
		for(String s : answer)
		{
			System.out.println(s);
		}
		
	}

}

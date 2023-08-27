package stringpractice;
import java.util.Scanner;


public class pro1 {
int a=10;

	public void add()
	{
		System.out.println(+a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int count=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string=");
		s=sc.nextLine();
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			count++;
				
			
		}
		
			
		System.out.println("no of char are="+ count);
	
	}

}


package New;
import java.util.Scanner;

public class class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks scored by you:");
		int m=sc.nextInt();
		if(m>=p)
		{
			System.out.println(" You are passed with"+m);
			}
		else
			System.out.println("You are failed ");

	}

}

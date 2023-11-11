package New;
import java.util.*;
public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to find large no in java
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if((a>b)&&(a>c)){
			System.out.println("a is bigger:"+a);
		}
		 if((b>a)&&(b>c)){
			System.out.println("b is bigger:"+b);
		}
		 if((c>a)&&(c>b)){
			System.out.println("c is bigger:"+c);
			}
		 if((a<b)&&(a<c)){
			System.out.println("a is Smaller:"+a);
		}
		 if((b<a)&&(b>c)){
			System.out.println("b is Smaller:"+b);
		}
		 if((c<a)&&(c<b)){
			System.out.println("c is Smaller:"+c);
			}
		 if((a==b)&&(b==c)&&(c==a)){
			System.out.println("All are equal"+a+" "+b+" "+c);
		}
		 if(a==b){
			System.out.println("both are same"+"a:"+a+" "+"b:"+b);
		}
		if(b==c){
			System.out.println("both are same"+"c:"+c+" "+"b:"+b);
		}
		if(a==c){
			System.out.println("both are same"+"a:"+a+" "+"c:"+c);
		}
		
	}

}

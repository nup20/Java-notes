

package stringbuilder;

public class build1  {
//StringBuilder
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Tony");
		System.out.println(sb);
		
		//char at index 0
		System.out.println(sb.charAt(0));
		
		//set char at Index 0
		sb.setCharAt(0,'A');
		System.out.println(sb);
		
		//insert char
		sb.insert(2, 'n');
		System.out.println(sb);
		
		//delete 
		sb.delete(2,3);
		System.out.println(sb);
		
		//append
		sb.append(2);
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		
		
		
		
		
		
		
		
		
		
	}

}

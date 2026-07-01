import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			s.push(ch);
		}
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=s.pop()){
				System.out.print("Not Palindrome");
				return;
			}
			
		}
		System.out.print("Palindrome");
		
	}
}
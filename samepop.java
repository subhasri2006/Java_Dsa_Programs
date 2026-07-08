import java.util.*;
public class samepop
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		Stack<Character> s=new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(!s.isEmpty() && s.peek()==ch) {
				s.pop();
			}
			else {
				s.push(ch);
			}

		}
		for(Character ch:s) {
			System.out.print(ch);
		}

	}
}
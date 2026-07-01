import java.util.*;
public class postfix
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a expression: ");
		String str =sc.nextLine();
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isDigit(ch)){
				stack.push(ch-'0');
			}
			else{
				int a=stack.pop();
				int b=stack.pop();
				if(ch=='+'){
					stack.push(b+a);
				}
				else if(ch=='-'){
					stack.push(b-a);
				}
				else if(ch=='*'){
					stack.push(b*a);
				}
				else if(ch=='/'){
					stack.push(b/a);
				}
			}
			
		}
		System.out.print(stack);
	}
}
import java.util.*;
public class stringreturn
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(Character.isLetter(ch)){
		        s.push(ch);
		    }
		}
		for(Character ch:s){
		    System.out.print(ch);
		}
	}
}
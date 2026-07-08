import java.util.*;
class valid{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String para = s.next();
		Stack<Character> st = new Stack<>();
		for(char c:para.toCharArray()){
			if(c=='['||c=='{'||c=='('){
				st.push(c);
			}
			else{
				if((st.peek()=='(')&&(c==')')){
					st.pop();
				}
				else if((st.peek()=='{')&&(c=='}')){
					st.pop();
				}
				else if((st.peek()=='[')&&(c==']')){
					st.pop();
				}
				else if(st.isEmpty()){
					System.out.println("Invalid");
					return;
				}
			}
		}
		if(st.isEmpty()){
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		}
		
	}
}
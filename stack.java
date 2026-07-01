import java.util.*;
class stack{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			st.push(sc.nextInt());
		}
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		
	}
	
}
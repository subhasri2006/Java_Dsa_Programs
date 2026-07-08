import java.util.*;
class stackorder{
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		int pushed[]=new int[n];
		int popped[] = new int[n];
		for(int i=0;i<n;i++){
			pushed[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			popped[i]=s.nextInt();
		}
		int index = 0;
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++){
			st.push(pushed[i]);
			if(st.peek()==popped[index]){
				st.pop();
				index++;
			}
		}
		for(int i=index;i<n;i++){
			if(st.peek()==popped[index]){
				st.pop();
				
			}
		}
		System.out.println(st.isEmpty()?"true":"false");
		
		
	}
}
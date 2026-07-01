import java.util.*;
class qreverse{
	public static void main(String[] args){
		Deque<Integer> q = new ArrayDeque<>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int index=0;
		for(int i=0;i<k;i++){
			q.addFirst(s.nextInt());
			index++;
		}
		for(int i=index;i<n;i++){
			q.addLast(s.nextInt());
		}
		System.out.println(q);
		
		
	}
}
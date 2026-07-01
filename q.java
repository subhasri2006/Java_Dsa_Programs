import java.util.*;
class q{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(10);
		qu.offer(20);
		System.out.print(qu.peek());
		System.out.print(qu);
		System.out.print(qu.size());
		qu.poll();
		System.out.print(qu);
	}
	
}
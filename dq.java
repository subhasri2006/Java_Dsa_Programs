import java.util.*;
class dq{
	public static void main(String[] args){
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(30);
		q.add(50);
		q.add(80);	
		q.add(20);
		q.add(10);
		q.poll();
		q.poll();
		
		System.out.println(q);		
	}
}
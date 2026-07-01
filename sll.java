import java.util.*;
class sll{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		int n = s.nextInt();
		for(int i=0;i<n;i++){
			list.add(s.nextInt());
		}
		System.out.println("The elements in the array are: "+list);
		/*for(int i:list){
			System.out.print(i+" ");
		}*/
		list.addFirst(90);
		list.addLast(10001);
		list.remove();
		System.out.println(list);
		
	}
}
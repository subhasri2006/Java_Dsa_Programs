import java.util.*;
class arraylist {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
		int n = s.nextInt();
		
		for(int i=0;i<n;i++){
			list.add(s.nextInt());
		}
		System.out.println("The elements in the array are: ");
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("The size of arraylist are: "+list.size());
		System.out.println("setmethod");
		System.out.println();
		list.set(4,9);
		for(int i=0;i<n;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println("After removal");
		list.remove(2);
		for(int i=0;i<n;i++){
			System.out.print(list.get(i)+" ");
		}
		list.clear();
		/*for(int i=0;i<n;i++){
			System.out.print(list.get(i)+" ");
		}*/
		System.out.println(list.isEmpty()?"list is empty":"list is not empty");
		
        
    }
}
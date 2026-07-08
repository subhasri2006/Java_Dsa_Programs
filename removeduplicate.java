import java.util.*;
class removeduplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>();
		int arr[]= new int[n];
		int arr2[]= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
		}
		for(int i:arr){
			set.add(i);
		}
		
		System.out.println("Intersection");
		for(int i:arr2){
			if(set.contains(i)){
				set2.add(i);
			}
			set.add(i);
		}
		
		System.out.println("Union"+set);
		System.out.println("Intersection"+set2);
		
	}
}
import java.util.*;
class area {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
		/*bruteforce
		for(int i=0;i<n;i++){
			int pivot=arr[i];
			int leftsum=0,rightsum=0;
			for(int j=i-1;j>=0;j--){
				leftsum+=arr[j];
			}
			for(int k=i+1;k<n;k++){
				rightsum+=arr[k];
			}
			
			if(leftsum==rightsum){
				System.out.println(i);
				found=true;
				return;
			}
		}
		if(!found){
			System.out.println("No pivots");
		}
		
		//diff approach
		int totalsum=0;
		for(int i=0;i<n;i++){
			totalsum+=arr[i];
		}
		int leftsum=0;
		for(int i=0;i<n;i++){
			int rightsum=totalsum-leftsum-arr[i];
			if(leftsum==rightsum){
				System.out.println(arr[i]);
				return;
			}
			leftsum+=arr[i];
		}
		System.out.println(-1);
		*/
		ArrayList<Integer> list = new ArrayList<>();
		int n = s.nextInt();
		for(int i=0;i<n;i++){
			list.add(s.nextInt());
		}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println(list.size());
		list.set(4,9);
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
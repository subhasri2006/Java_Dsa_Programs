import java.util.*;
class rotatesorted{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}	
		
		int f =0,l=n-1;
		while(f<=l){
			int mid=(f+l)/2;
			
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
				System.out.println(arr[mid]);
				return;
			}
			else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
				f=mid+1;
			}
			
			else{
				l=mid-1;
			}
		}
		System.out.println(-1);
		
	}
}
		
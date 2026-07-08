import java.util.*;
class kthlargest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int k = s.nextInt();
		if(k>n){
			System.out.println("Not found");
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int max1=0,max2=0;
		for(int i=0;i<n;i++){
			if(max1<arr[i]){
				max2=max1;
				max1=arr[i];
				
			}
			else if(max1>arr[i] && max2<arr[i]){
				max2=arr[i];
			}
		}
		System.out.println("max1: "+max1+"max2: "+max2);
	}
}
		
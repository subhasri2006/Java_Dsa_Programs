import java.util.*;
class arrayleader{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int max=arr[n-1];
		System.out.print(max+" ");
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>max){
				System.out.print(arr[i]+" ");
				max=arr[i];
			}
		}
	}
}
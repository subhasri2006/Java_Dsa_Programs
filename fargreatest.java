import java.util.*;
class fargreatest{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		System.out.println("The next greatest elements are");
		for(int i=0;i<n;i++){
			for(int j=n-1;j>=0;j--){
				if(arr[i]<arr[j]){
					System.out.print(arr[j]+" ");
					break;
				}
				else if(arr[i]==arr[j]){
					System.out.print(-1+" ");
					break;
				}
			}
		}
	}
}
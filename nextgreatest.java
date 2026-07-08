import java.util.*;
class nextgreatest{
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
			for(int j=i+1;j<n;j++){
				if(max<arr[j]){
					max=arr[j];
					System.out.print(max+" ");
				}
				
			}
		}
		
	}
}
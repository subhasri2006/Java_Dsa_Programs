import java.util.*;
class linear{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}	
		int target = s.nextInt();
		for(int i:arr){
			if(i==target){
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
		}
}
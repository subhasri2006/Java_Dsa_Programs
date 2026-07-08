import java.util.*;
class zoho{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i+=2){
			for(int j=i+2;j<n;j+=2){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=1;i<n;i+=2){
			for(int j=i+2;j<n;j+=2){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*for(int i=0;i<n;i++){
			if(i%2==0){
				if((i+2)<n && arr[i]<arr[i+2]){
					int temp = arr[i];
					arr[i]=arr[i+2];
					arr[i+2]=temp;
				}
			}
			if(i%2!=0){
				if((i+2)<n && arr[i]>arr[i+2]){
					int temp = arr[i];
					arr[i]=arr[i+2];
					arr[i+2]=temp;
				}
			}
		}*/
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}
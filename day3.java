import java.util.*;
class day3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//move zeros to end
		/*int[] arr={3,0,1,0,5};
		int left=0,right=arr.length-1;
		while(left<=right){
			if(arr[left]==0 && arr[right]!=0){
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			else if(arr[left]!=0){
				left++;
			}
			else{
				right--;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}*/
		//Subarray sum:
		/*
		int sum=0;
		int max=arr[0];
		for(int i=0;i<n;i++){
			sum=0;
			
			for(int j=i;j<n;j++){
				sum+=arr[j];
				if(sum>max){
					max=sum;
				}
			}
			if(sum>max){
				max=sum;
			}
			
		}
		System.out.println(max);
		*/
		//kadane's algorithm
		/*
		int max=0;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			if(sum>max){
				max=sum;
			}
			if(sum<0){
				sum=0;
			}
		}
		System.out.println(max);
		
		int n=s.nextInt();
		int k=3;
		int sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<=n-k;i++){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			sum=0;
			for(int j=i;j<i+k;j++){
				sum+=arr[j];
			}	
			System.out.print(sum+" ");
		}
		*/
		/*//optimized approach
		
		for(int i=0;i<k;i++){
			sum+=arr[i];
		}
		int max = sum;
		for(int j=k;j<n;j++){
			sum=(sum-arr[j-k])+arr[j];
			max=Math.max(max,sum);
		}
		System.out.println(max);*/
		
	}
}
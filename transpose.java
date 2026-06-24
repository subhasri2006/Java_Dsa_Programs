import java.util.*;
public class transpose
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int n=4,m=4;
		int[][] mat = new int[n][m];
		int top=0,bottom=n-1,left=0,right=n-1;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        mat[i][j]=s.nextInt();
		    }
		}
		
		/*int[][] mat2 = new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        mat2[i][j]=s.nextInt();
		    }
		}
		int[][] add = new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        for(int k=0;k<n;k++){
		            add[i][j]=mat[i][k]*mat2[k][j];
		        }
		        
		    }
		}
		System.out.println("matrix 1:");
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(mat2[i][j]+" ");
		    }
		    System.out.println();
		}*/
		System.out.println("Spiral:");
		System.out.println("top");
		for(int i=left;i<=right;i++){
		        System.out.print(mat[top][i] + " ");
		}
		top++;
		System.out.println("right");
		for(int i=top;i<=bottom;i++){
		        System.out.print(mat[i][right] + " ");
		}
		right--;
		System.out.println("Bottom");
		for(int i=right;i>=left;i--){
		        System.out.print(mat[bottom][i] + " ");
		}
		bottom--;
		System.out.println("left");
		for(int i=bottom;i>=top;i++){
		        System.out.print(mat[i][left] + " ");
		}
		
		/*
		System.out.println("Multiplication of two matrices are");
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(add[i][j]+" ");
		    }
		    System.out.println();
		}*/
		
	}
}
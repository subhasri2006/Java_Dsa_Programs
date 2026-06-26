import java.util.*;
class day3string{
	public static void main(String[] args){
		
		/*int count=0;
		String t = v.trim();
		for(int i=t.length()-1;i>=0;i--){
			if(t.charAt(i)!=' '){
				
				count++;
			}
			else{
				break;
			}
		}
		System.out.println(count);*/
		Scanner s = new Scanner(System.in);
		String v = s.nextLine();
		for(int i=0;i<v.length();i++){
			char c = v.charAt(i);
			
			if(Character.isLetter(c)){
				String n="";
				int j=i+1;
				while(j<v.length()&&Character.isDigit(v.charAt(j))){
					n+=v.charAt(j);
					j++;
				}
				int k = Integer.parseInt(n);
				
				while(k>0){
					System.out.print(c);
					k--;
				}
				i=j-1;
			}
		}
	}
} 
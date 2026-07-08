import java.util.*;
class stringremoval{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str2 = s.nextLine();
		String k = "";
		HashSet<Character> set = new LinkedHashSet<>();
		for(char c:str2.toCharArray()){
			set.add(c);
		}
		for(char c:str.toCharArray()){
			if(!set.contains(c)){
				k+=c;
			}
		}
		System.out.println(k);
		
		
	}
}
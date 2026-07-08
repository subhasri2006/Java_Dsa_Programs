import java.util.*;
class maps{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Map<Character,Integer> map = new HashMap<>();
		String str = s.nextLine();
		String str2 = s.nextLine();
		for(char c:str.toCharArray()){
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(char c:str2.toCharArray()){
			if(map.containsKey(c)){
				map.put(c,map.getOrDefault(c,0)-1);
			}
			if(map.get(c)==0){
				map.remove(c);
			}		
		}
		if(map.isEmpty()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
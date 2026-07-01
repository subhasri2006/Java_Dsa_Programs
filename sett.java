import java.util.*;
class sett{
	public static void main(String[] args){
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(40);
		set.add(30);
		System.out.println(set);
		set.remove(40);
		System.out.println(set);
		System.out.println(set.contains(40));
		System.out.println(set.isEmpty());
	}
}
 
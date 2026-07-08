import java.util.*;
class sett{
	public static void main(String[] args){
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(40);
		set.add(30);
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println("higher than 20:"+set.higher(20));
		System.out.print("Lower than 40: "+set.lower(40));
		
	}
}
 
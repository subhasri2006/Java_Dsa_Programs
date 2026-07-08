import java.util.*;
class leaderboard{
	public static void main(String[] args){
		TreeSet<Integer> set = new TreeSet<>();
		Scanner s = new Scanner(System.in);
		String k = s.nextLine();
		while(!k.equals("end")){
			set.add(s.nextInt());
			System.out.println("High Score: "+set.last());
		}
	}
}
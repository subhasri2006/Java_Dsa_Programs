import java.util.*;

class dup {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int k = s.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {

            if(set.contains(arr[i])) {
                System.out.println("true");
                return;
            }

            set.add(arr[i]);

            // Keep only last k elements in the window
            if(set.size() > k) {
                set.remove(arr[i - k]);
            }
        }

        System.out.println("false");
    }
}
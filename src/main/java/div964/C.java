package div964;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0) {
            int n = cin.nextInt();
            int s = cin.nextInt();
            int m = cin.nextInt();
            int l[] = new int[n];
            int r[] = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = cin.nextInt();
                r[i] = cin.nextInt();
            }
            List<Integer> diff = new ArrayList<>();
            diff.add(l[0]);
            for (int i = 1; i < n; i++) {
                diff.add(l[i] - r[i - 1]);
            }
            diff.add(m - r[n - 1]);
            boolean found = false;
            for(int index : diff){
                if(index >= s) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }

    }
}

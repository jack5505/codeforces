
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int j = 2 ; j < 6; j ++)
        {
            for (int mask = 0; mask < (1 << j); mask++)
            {
                int mx = 0;
                for (int i = 0; i < j; i++)
                {
                    if ((mask & (1 << i)) != 0) {
                        mx = mx * 10 + 4;
                    } else {
                        mx = mx * 10 + 7;
                    }
                }
                System.out.println(mx);
            }
        }
    }
}

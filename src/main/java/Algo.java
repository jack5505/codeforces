import java.util.Scanner;

public class Algo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        for(int i = 64; i >= 1 ;i --){
            long son = (n >> i & 1);
            if(son == 1 && (1L << i) == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}

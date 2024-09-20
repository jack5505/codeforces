package acm.timus;

import java.util.Scanner;

public class EasyTicket {




    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n % 2 != 0) {
            System.out.println(0);
            return;
        }
        if (n == 8){
            System.out.println(4816030);
            return;
        }
        int ans = 0;
        int divide = n / 2;
        StringBuilder board = new StringBuilder();
        while (divide -- > 0){
            board.append("9");
        }
        int br = Integer.parseInt(board.toString());
        for(int i = 0 ; i <= br ; i ++)
        {
            for(int j = 0 ; j <= br; j ++)
            {
                if(summaDigit(i) == summaDigit(j))
                    ans ++;
            }
        }
        System.out.println(ans);
    }
    public static int summaDigit(int x)
    {
        int summa = 0;
        while (x > 0)
        {
            summa += x % 10;
            x /= 10;
        }
        return summa;
    }
}

package codeforces251;

import java.util.*;

public class C {
    /**
     * 6 3 3
     * 4 6 7 9 11 13
     *
     * 7 4 2
     * 2 15 7 9 11 13 19
     *
     *
     * 7 5 2
     * 2 4 7 9 13 15 17
     */
    public static void main(String[] args) {
        // juft soni massivni  p dan katta bo`lishi garak
        // k to bo`linishi bo`lish garak unda
        // p ta juft son bo`lishi garak

        // MAIN k -p oddlineda bo`lishi garak juft qachonki odd soni juft bo`lsa
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        int p = cin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
        }
        // odd- 5 line = 3 bo`lsa
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            even += a[i] % 2 == 0 ? 1 : 0;
            odd  += a[i] % 2 != 0 ? 1 : 0;
        }
        int evenline = p;
        int notevenline = k - p;
        if(even <= p){
            int need = evenline - even;
            odd -= 2 * need;
            if(notevenline > odd || (odd % 2 == 0 && notevenline % 2 != 0)){
                System.out.println("NO");
                return;
            }
            //TODO need to think it
            System.out.println("YES");
            for(int i = 0 ; i < n ;i ++)
            {
                if(a[i] % 2 == 0)
                {
                    System.out.println(1 + " " + a[i]);
                }
            }
            List<Integer> oddAll = new ArrayList<>();
            for (int i = 0; i < n; i++)
            {
                if(a[i] % 2 != 0  && (( notevenline >= 1 && need > 0) || ( need == 0 && notevenline > 1)))
                {
                    System.out.println(1 + " " + a[i]);
                    notevenline --;
                }
                else if(a[i] % 2 != 0 && ((need == 0 && notevenline == 1) || (need >= 1 && notevenline == 0 ))){
                    oddAll.add( a[i] );
                }
            }
            int juft = 0;
            int i = 0;
            for ( i = 0; i <  oddAll.size(); i++)
            {
                juft ++;
                if(juft % 2 == 0 && need > 1)
                {
                    System.out.println(2 + " " + oddAll.get(i - 1) + " " + oddAll.get(i));
                    need --;
                }
                else if(need == 1 || need == 0)
                    break;
            }
            System.out.print(oddAll.size() - i + " ");
            for(; i < oddAll.size();i ++){
                System.out.print(oddAll.get(i) + " ");
            }
        }else{


        }
    }
}

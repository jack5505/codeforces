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
     *
     * 6 3 1
     * 2 4 6 8 7 9
     *
      5 2 2
      316313049 24390603 595539594 514135024 39108
     *
     * 4 2 2
     * 736788713 82230 66800 37791827
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
            // todo need to test well
            int need = evenline - even;
            odd -= 2 * need;
            if(notevenline > odd || (odd % 2 == 0 && notevenline % 2 != 0) || ( odd % 2 != 0 && notevenline % 2 == 0)){
                System.out.println("NO");
                return;
            }
            if(k == p && need == 0){
                System.out.println("YES");
                List<Integer> last = new ArrayList<>();
                for(int i = 0 ; i < n ;i ++){
                    if(a[i] % 2 == 0 && p > 1){
                        System.out.println(1 + " " + a[i]);
                        p --;
                    }else{
                        last.add(a[ i ]);
                    }
                }
                System.out.print(last.size() + " ");
                for(Integer item : last){
                    System.out.print(item + " ");
                }
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
            //
            //5 2 2
            //316313049 24390603 595539594 514135024 39108
            // bu holatd juftla ko`p berda
            int oddLine = k - p;
            if(oddLine > odd || (odd %  2 == 0 && oddLine % 2 != 0) || (odd % 2 != 0 && oddLine % 2 == 0)){
                System.out.println("NO");
                return;
            }
            System.out.println("YES");
            List<Integer> oddList = new ArrayList<>();
            List<Integer> evenLast = new ArrayList<>();
            int i = 0;
            for ( i = 0; i < n; i++)
            {
                if(a[i] % 2 == 0 && p >= 1)
                {
                    if(p > 1) {
                        System.out.println(1 + " " + a[i]);
                        p--;
                    }else
                        evenLast.add( a[i] );
                }else{
                    oddList.add( a[i] );
                }
            }
            if(oddLine == 0){
                System.out.print(evenLast.size() + oddList.size() + " ");
                for(Integer e: evenLast){
                    System.out.print(e + " ");
                }
                for(Integer e: oddList){
                    System.out.print(e + " ");
                }
                return;
            }
            if(evenLast.size() >= 1) {
                System.out.print(evenLast.size() + " ");
                for (Integer e : evenLast) {
                    System.out.print(e + " ");
                }
                System.out.println();
            }
            i = 0;
            for(i = 0; i < oddList.size(); i ++)
            {
                if(oddLine > 1)
                {
                    System.out.println(1 + " " + oddList.get(i));
                    oddLine --;
                }else
                    break;
            }
            System.out.print(oddList.size() - i + " ");
            for( ; i < oddList.size() ; i++){
                System.out.print(oddList.get(i) + " ");
            }

        }
    }
}

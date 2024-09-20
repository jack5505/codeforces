package backtrack;

import java.util.Scanner;

public class Unique {
    static void solve(int a[],int pos){
        if(pos > a.length){
            return;
        }
        for (int i = pos ; i < a.length; i++) {
            System.out.print(a[ i ] + " ");
            solve(a,i + 1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a [] = new int[]{2,3,4,6,7,9};
        int n = a.length;
        solve(a,0);

    }
}

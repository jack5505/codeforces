package educationA;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a [] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }

        int m = cin.nextInt();
        int i = Arrays.binarySearch(a, m);
        System.out.println(i);
    }
    public static int index(int a[],int x ){
        int l = 0;
        int r = a.length - 1;
        while (l <= r)
        {
            int m = l + (r - l) >> 1;
            if(a[m] < x)
                l = m + 1;
            else {
                r = m - 1;
            }
        }
        if(a[l] == x)
            return l;
        return -1;
    }
}

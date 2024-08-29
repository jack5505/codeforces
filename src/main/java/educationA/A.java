package educationA;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int n = cin.nextInt();
            Integer a [] = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
            Arrays.sort(a);
            int middle = n / 2;
            System.out.println(a[middle]);

        }
    }
}

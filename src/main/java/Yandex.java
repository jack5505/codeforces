import java.util.Arrays;
import java.util.Scanner;

public class Yandex {

    private static int minSwapsToGroup(int[] arr) {
        int N = arr.length;
        int onesCount = 0;

        for (int num : arr) {
            if (num == 1) {
                onesCount++;
            }
        }


        if (onesCount == 0 || onesCount == N) {
            return 0;
        }


        int minSwaps = onesCount;
        int currentWindowOnes = 0;


        for (int i = 0; i < onesCount; i++) {
            if (arr[i] == 1) {
                currentWindowOnes++;
            }
        }
        minSwaps = onesCount - currentWindowOnes;


        for (int i = 1; i < N; i++) {
            int removeIndex = (i - 1) % N;
            int addIndex = (i + onesCount - 1) % N;

            if (arr[removeIndex] == 1) {
                currentWindowOnes--;
            }
            if (arr[addIndex] == 1) {
                currentWindowOnes++;
            }
            minSwaps = Math.min(minSwaps, onesCount - currentWindowOnes);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = minSwapsToGroup(arr);
        System.out.println(result);


    }
}

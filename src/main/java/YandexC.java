import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class YandexC {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        // Read N, M, K
        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int K = Integer.parseInt(firstLine[2]);

        // Data structures
        Map<Integer, Integer> numberToIndex = new HashMap<>();
        int[] minArray = new int[N];
        int[] maxArray = new int[N];
        Arrays.fill(minArray, Integer.MIN_VALUE);
        Arrays.fill(maxArray, Integer.MAX_VALUE);

        // Read binary search results
        for (int i = 0; i < M; i++) {
            String[] parts = reader.readLine().split(" ");
            int number = Integer.parseInt(parts[0]);
            int index = Integer.parseInt(parts[1]);
            numberToIndex.put(number, index);

            // Update min and max arrays
            minArray[index] = Math.max(minArray[index], number);
            maxArray[index] = Math.min(maxArray[index], number);
        }

        // Process queries
        for (int i = 0; i < K; i++) {
            int query = Integer.parseInt(reader.readLine());
            Integer knownIndex = numberToIndex.get(query);

            if (knownIndex != null) {
                writer.println(knownIndex);
            } else {
                boolean possible = false;
                boolean definitelyNotInArray = true;

                for (int j = 0; j < N; j++) {
                    if (minArray[j] <= query && query <= maxArray[j]) {
                        possible = true;
                        if (minArray[j] == query && maxArray[j] == query) {
                            writer.println(j);
                            possible = false;
                            break;
                        }
                    }
                }

                if (!possible) {
                    writer.println(definitelyNotInArray ? -1 : -2);
                }
            }
        }

        reader.close();
        writer.close();
    }
}

package template;

// ============================================================
// Шаблон для Codeforces (Java) — быстрый ввод/вывод
//
// При отправке на Codeforces:
//   1) удали строку "package template;"
//   2) класс должен называться Main (он уже так называется)
//   3) отправь весь файл целиком
// ============================================================

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static FastScanner in = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        // Если в задаче несколько тестов: читаем их количество
        int t = in.nextInt();
        while (t-- > 0) {
            solve();
        }
        // Обязательно flush в конце, иначе вывод может потеряться
        out.flush();
        out.close();
    }

    static void solve() {
        // ===== Пиши решение здесь =====
        int n = in.nextInt();
        int[] a = in.readIntArray(n);
        // ...
        out.println("ответ");
    }

    // Защита от анти-sort тестов Codeforces:
    // Arrays.sort на int[] может падать в TLE на хитрых тестах.
    // Используй shuffleSort (или сортируй Integer[] — там mergesort).
    static void shuffleSort(int[] a) {
        java.util.Random rnd = new java.util.Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        Arrays.sort(a);
    }
}

class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble() { return Double.parseDouble(next()); }

    // Читает следующую строку целиком (когда нужен ввод с пробелами)
    String nextLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Чтение до конца файла (для задач без количества тестов)
    boolean hasNext() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null) return false;
                st = new StringTokenizer(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    int[] readIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }

    long[] readLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

    private static void merge(int[] X, int[] Y, int m, int n) {
        int k = m + n + 1;

        while (m >= 0 && n >= 0) {
            if (X[m] > Y[n]) {
                X[k--] = X[m--];
            } else {
                X[k--] = Y[n--];
            }
        }

        while (n >= 0) {
            X[k--] = Y[n--];
        }

        Arrays.fill(Y, 0);
    }

    private static void rearrange(int[] X, int[] Y) {
        if (X.length == 0) {
            return;
        }

        int k = 0;
        for (int value : X) {
            if (value != 0) {
                X[k++] = value;
            }
        }

        merge(X, Y, k - 1, Y.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Enter the elements of array X:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] y = new int[m];
        System.out.println("Enter the elements of array Y:");
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        rearrange(x, y);
        System.out.println("Merged array x:");
        System.out.println(Arrays.toString(x));
    }
}

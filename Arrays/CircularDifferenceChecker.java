import java.util.Arrays;
import java.util.Scanner;

public class CircularDifferenceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            if (Math.abs(arr[i] - arr[next]) <= 15) {
                res[i] = 0;
            }

            else
                res[i] = 1;
        }
        sc.close();
        System.out.println(Arrays.toString(res));
    }
}

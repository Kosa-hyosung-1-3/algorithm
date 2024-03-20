package w1;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        int[][] nArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    nArr[i][j] = num++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    nArr[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < nArr.length; i++) {
            for (int j = 0; j < nArr[i].length; j++) {
                System.out.printf(" %d ", nArr[i][j]);
            }
            System.out.println();
        }
    }
}

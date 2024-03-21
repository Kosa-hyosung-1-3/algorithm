package w1;
import java.util.*;

public class no12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nArr = new int[n][n];
		int num = 1;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				nArr[j][i] = num;
				//System.out.println("[j] = " + j + " [i] = " + i + " " + nArr[j][i]);
				num++;
			}
		}
		
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(nArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

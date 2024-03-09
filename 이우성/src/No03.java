import java.util.Scanner;

/// 최빈수 구하기
public class No03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] mode = new int[10];

        for (int i = 0; i < nums.length; i++) {
             mode[nums[i]]++;
        }

        int modeNum = 0;
        int modeCount = 0;
        for (int i = 0; i < mode.length; i++) {
            if(modeCount < mode[i]) {
                modeCount = mode[i];
                modeNum = i;
            }
        }

        System.out.printf("최빈수 : %d, 카운트 : %d", modeNum, modeCount);
    }
}

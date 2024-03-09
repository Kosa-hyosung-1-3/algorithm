public class No02 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++) {
            if(i < 2) nums[i] = 1;
            else nums[i] = nums[i - 1] + nums[i -2];
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int prev = 1;
        int prevPrev = 1;
        for(int i = 0; i < 10; i++){
            int current = 1;
            if(i == 0) {
                prev = 1;
            }else if(i == 1){
                prevPrev = 1;
            }else{
                current = prev + prevPrev;
                prevPrev = prev;
                prev = current;
            }
            System.out.print(current + " ");
        }
    }
}

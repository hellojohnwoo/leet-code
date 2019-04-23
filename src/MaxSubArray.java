public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] d = new int[nums.length];
        d[0] = nums[0];

        for(int i=1; i<nums.length; i++) {
            d[i] = Math.max(d[i-1]+nums[i], nums[i]);
        }

        int max = d[0];
        for(int num:d)
            if(num>max) max = num;
        return max;

    }
}

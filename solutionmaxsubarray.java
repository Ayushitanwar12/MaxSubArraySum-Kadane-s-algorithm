public class solutionmaxsubarray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];  
        int maxsum = nums[0];  
        for (int i = 1; i < nums.length; i++) {
            maxsum = Math.max(maxsum + nums[i], nums[i]);  
            res = Math.max(maxsum, res); 
        }
        return res;  
    }

    public static void main(String[] args) {
        solutionmaxsubarray solution = new solutionmaxsubarray(); 
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums));  
    }
}

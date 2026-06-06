class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currMax = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currMax++;
                max = Math.max(max, currMax);
            }else{
                currMax = 0;
            }
        }
        return max;
    }
}
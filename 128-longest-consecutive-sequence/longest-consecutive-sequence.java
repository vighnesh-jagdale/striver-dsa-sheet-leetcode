class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int maxLen = 1;

        if(nums.length == 0 || nums == null) return 0;


        for(int  i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] == nums[i-1] + 1){
                count++;
            }else{
                maxLen = Math.max(maxLen,count);
                count = 1;
            }
        }

        return  Math.max(maxLen,count);



        // Arrays.sort(nums);
        // int maxLen = 0;

        // int i = 0;
        // int j = i + 1;
        // int count = 0;

        // while (j < nums.length) {
        //     if (nums[i] <= nums[j] && nums[j] - nums[i] == 1) {
        //         count++;
        //         maxLen = Math.max(maxLen, count+1);
        //     }
        //     i++;
        //     j++;
        // }
        // return maxLen;
    }
}

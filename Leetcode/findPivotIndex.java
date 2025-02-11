class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; 
        }
        for(int i = 0; i < nums.length; i++){
            if(leftSum == sum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
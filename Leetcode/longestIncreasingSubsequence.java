//Improved Solution
class Solution {
    public int lengthOfLIS(int[] nums) {
        return LISBU(nums);
    }
    
    public static int LISBU(int[] arr){
        int[] le = new int[arr.length];
        le[0] = arr[0];
        int len = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > le[len-1]){
                le[len] = arr[i];
                len++;
            }
            else{
                int idx = binarySearch(le, 0, len-1, arr[i]);
                le[idx] = arr[i];
            }
        }
        return len;
    }

    public static int binarySearch(int[] le, int si, int ei, int item){
        int low = si;
        int high = ei;
        while(low <= high){
            int mid = (low + high) / 2;
            if(item > le[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }
}


//Old Solution

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] strg = new int[nums.length];
        Arrays.fill(strg, 1);
        for(int i = 0; i < strg.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    strg[i] = Math.max(strg[i], strg[j]+1);
                }
            }
        }
        int max = 1;
        for(int i = 0; i < strg.length; i++){
            if(strg[i] > max){
                max = strg[i];
            }
        }
        return max;
    }
}
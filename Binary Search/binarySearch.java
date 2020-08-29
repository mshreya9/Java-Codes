class Solution {
    public static int binarySearch(int[] arr, int elem){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == arr[mid]){
                return mid;
            }
            else if(elem < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int elem = 3;
        System.out.println(binarySearch(arr, elem));
    }
}

//Output: 2
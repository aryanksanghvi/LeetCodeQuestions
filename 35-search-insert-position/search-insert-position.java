class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int t = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
                t = low;
            }
            else if(nums[mid] > target){
                high = mid - 1;
                if(high < 0){
                    t = 0;
                }
            }
            else{
                return 0;
            }
        }
        return t;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = first(nums, target);
        arr[1] = second(nums, target);
        return arr;
    }
        public int first(int[] nums, int target){
            int low = 0;
            int high = nums.length - 1;
            int r = -1;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(target > nums[mid]){
                    low = mid + 1;
                }
                else if(target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    r = mid;
                    high = mid - 1;
                }
            }
            return r;
        }
        public int second(int[] nums, int target){
            int low1 = 0;
            int high1 = nums.length - 1;
            int r = -1;
            while(low1 <= high1){
                int mid1 = low1 + (high1 - low1) / 2;
                if(target > nums[mid1]){
                    low1 = mid1 + 1;
                }
                else if(target < nums[mid1]){
                    high1 = mid1 - 1;
                }
                else{
                    r = mid1;
                    low1 = mid1 + 1;
                }
            }
            return r;
        }
}
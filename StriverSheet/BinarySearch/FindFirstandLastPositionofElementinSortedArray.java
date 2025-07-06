//lc 34
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = searchIndex(nums , target , true);
        int last = searchIndex(nums ,target , false);
        return new int[]{first , last};
    }

    private static int searchIndex(int[] nums , int target ,boolean findFirst){
        int low = 0;
        int high = nums.length-1;
        int index= -1;
        while( low <= high){
            int mid = (low + high)/2;
            if( nums[mid] == target){
                index = mid;
                if(findFirst){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return index;
    }
}

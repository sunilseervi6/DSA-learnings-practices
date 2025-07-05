//leetcode 540 .... the below approach is o(n)...and the optimized is o(log n ) binary search
/*
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=0 ; i<n ; i++){
            if(i==0){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            else if( i== n-1){
                if(nums[n-1] != nums[n-2]){
                    return nums[n-1];
                }
            }
            else{
                if((nums[i]!=nums[i-1]) && (nums[i] != nums[i+1])){
                    return nums[i];
                }
            }
        }
        return -1;
    }
} */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0 ;
        int high = nums.length-1;
        while(low < high){
            int mid = (low + high)/2;

            if(mid % 2 == 1) mid--;
            
            if(nums[mid] == nums[mid+1]){
                low = mid + 2;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}

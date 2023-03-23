class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans = i;
                break;
            }
        }
        if(ans==0)
        {
        for(int i=0; i<nums.length-1;i++){
            if(target>nums[i] && target<nums[i+1])
            {
                ans = i+1;
                break;
            }
        }
        if(target<nums[0])
        ans = 0;
        else if(target>nums[nums.length-1])
        ans = nums.length;
        }
        return ans;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int ctr =-0, n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == val)
            ctr++;
            else
            nums[i-ctr] = nums[i];
        }
        return n-ctr;
    }
}
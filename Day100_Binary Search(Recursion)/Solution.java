class Solution {
    public int search(int[] nums, int target) {
	return  Bs(nums,target,0,nums.length-1);
    }

    static int Bs(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(target == arr[mid])
        {
            return mid;
        }

        if(target<arr[mid]){
            return Bs(arr,target,start,mid-1);
        }
        return Bs(arr,target,mid+1,end);
    }
}
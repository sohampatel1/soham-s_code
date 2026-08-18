class Solution {
    public int findMin(int[] nums) {
    if(nums.length==1)return nums[0];
    int min=nums[0];
    for(int i=1;i<nums.length;i++)
    {if(min>nums[i]) min=nums[i];
    }
    return min;   
    }
}
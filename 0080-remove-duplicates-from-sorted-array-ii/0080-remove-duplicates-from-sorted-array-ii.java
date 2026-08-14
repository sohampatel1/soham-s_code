class Solution {
    public int removeDuplicates(int[] nums) {
      int i=2,d=2;
      if(nums.length<=2) return nums.length;
    while(i<nums.length)
    {if(nums[i]>nums[d-2]) nums[d++]=nums[i];
    i++;
    }
    return d;  
    }
}
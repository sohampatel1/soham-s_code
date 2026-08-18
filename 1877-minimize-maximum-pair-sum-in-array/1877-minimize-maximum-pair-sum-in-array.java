class Solution {
    public int minPairSum(int[] nums) {
    Arrays.sort(nums);
    int max=0,n=nums.length;
    for(int i=0;i<n/2;i++)
    {int s=0;
    s+=nums[i]+nums[n-1-i];
    if(max<s)max=s;
    }
    return max;    
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
    int in=0,max=nums[in],n=nums.length;
    for(int i=0;i<n;i++)
    {if((i==0||nums[i]>nums[i-1]) && (i==n-1||nums[i]>nums[i+1])) 
    {if(max<nums[i])
    {max=nums[i];
    in=i;
    }
    }
    }    
    return in;
    }
}
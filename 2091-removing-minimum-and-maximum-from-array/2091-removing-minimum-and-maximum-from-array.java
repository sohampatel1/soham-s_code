class Solution {
    public int minimumDeletions(int[] nums) {
    int max=nums[0],im=0,min=nums[0],in=0,n=nums.length;
    for(int i=0;i<n;i++)
    {if(max<nums[i])
    {max=nums[i];
    im=i;
    }
    if(min>nums[i])
    {min=nums[i];
    in=i;
    }
    }
    int p1=Math.min(in,im);
    int p2=Math.max(in,im);
    int caseleft=p2+1;
    int caseright=n-p1;
    int both=(p1+1)+(n-p2);
    return Math.min(caseleft,Math.min(caseright,both));
    }
}
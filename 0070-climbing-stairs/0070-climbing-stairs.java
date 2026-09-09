class Solution {
    public int climbStairs(int n) {
        int ans[]=new int[n+1];
        return b(n,ans);
    }
    public int b(int n, int[]ans)
    {if(n<=3) return n;
    else if(ans[n]!=0) return ans[n];
    else return ans[n]=b(n-1,ans)+b(n-2,ans);
    }
}
class Solution {
    public int maxCoins(int[] piles) {
    Arrays.sort(piles);
    int s=0,n=piles.length,c;
    if(n%2==0) c=0;
    else c=1;
    for(int i=n-1;i>=(n/3);i--)
    {if(i%2==c) s+=piles[i];
    }
    return s;    
    }
}
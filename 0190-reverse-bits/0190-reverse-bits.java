class Solution {
    public int reverseBits(int n) {
    int sum=0,c=31;
    while(n!=0)
    {sum+=(n&1)*Math.pow(2,c--);
    n>>=1;
    }
    return sum;
}}
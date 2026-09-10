class Solution {
    public int fib(int n) {
    int a[]=new int[n+1];
    a[0]=0;
    if(n>=1) a[1]=1;
    if(n==0||n==1) return a[n];
    else
    {for(int i=2;i<n+1;i++)
    {a[i]=a[i-1]+a[i-2];
    }
    }
    return a[n];     
    }
}
class Solution {
    public int[][] generateMatrix(int n) {
    int a=n,i=0,j=-1,num=1;
    int arr[][] = new int[n][n];
    for(int k=1;k<n*2;k++)
    {int c=k%4;
    for(int l=0;l<a;l++)
    {if(c==1) j++;
     else if(c==2) i++;
     else if(c==3) j--;
     else i--;
     arr[i][j]=num;
     num++;
    }
    if(k%2!=0) a--;
    }
    return arr;
    }
}
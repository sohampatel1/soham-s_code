class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    int n=matrix.length,m=matrix[0].length;
    List<Integer>b=new ArrayList<Integer>();
    int a=n-1,d=m,i=0,j=-1;
    for(int k=1;b.size()<m*n;k++)
    {int c=k%4,o;
    if(k%2==0)
    {o=a;
    a--;}
    else 
    {o=d;
    d--;}
    for(int l=0;l<o;l++)
    {if(c==1) j++;
     else if(c==2) i++;
     else if(c==3) j--;
     else i--;
     b.add(matrix[i][j]);
    }
    }
    return b;   
    }
}
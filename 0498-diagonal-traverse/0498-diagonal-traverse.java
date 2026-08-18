class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
    List<List<Integer>>d=new ArrayList();
    int m=mat.length;
    int n=mat[0].length,c=0;
    for(int i = 0; i < m + n - 1; i++) {
    d.add(new ArrayList<>());
    }
    int a[]=new int[m+n-1];
    int b[]=new int[m*n];
    for(int i=0;i<m+n-1;i++) a[i]=i;
    for(int i=0;i<m;i++)
    {for(int j=0;j<n;j++)
    {if(a[i+j]==i+j)
     {d.get(i+j).add(mat[i][j]);
     }
    }
    }
    for(int i=0;i<d.size();i++)
    {if(i%2!=0){
    for(int j=0;j<d.get(i).size();j++)
    {b[c]=d.get(i).get(j);
    c++;
    }}
    else
    {for(int j=d.get(i).size()-1;j>=0;j--)
    {b[c]=d.get(i).get(j);
    c++;
    }
    }}

    return b;
    }
}
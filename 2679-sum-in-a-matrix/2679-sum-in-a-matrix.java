class Solution {
    public int matrixSum(int[][] nums) {
    List<List<Integer>>a=new ArrayList();
    int r=nums.length,c=nums[0].length;
    for(int i=0;i<r;i++)
    { List<Integer>b=new ArrayList();
    for(int j=0;j<c;j++)
    {b.add(nums[i][j]);
    }
    Collections.sort(b);
    a.add(b);
    }
int s=0;
for(int j=0;j<c;j++)
{int max=0;
for(int i=0;i<r;i++)
{if(max<a.get(i).get(j))
{max=a.get(i).get(j);}
}
s+=max;
}
return s;
    }
}
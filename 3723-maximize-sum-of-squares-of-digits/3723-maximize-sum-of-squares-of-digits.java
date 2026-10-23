class Solution {
    public String maxSumOfSquares(int num, int sum) {
    if(num==1 && sum>9) return "";
    StringBuilder s=new StringBuilder();
    int c=0,x;
    if(sum>9)
    {x=sum%9;
    int y=sum/9;
    if(x!=0)c=1;
    c+=y;
    if(c>num) return "";
    for(int i=0;i<y;i++) s.append(9);
    if(x!=0)  s.append(x);
    y=s.length();
    }
    else
    {s.append(sum);
    }
    x=s.length();
    for(int i=x;i<num;i++) s.append(0);
    return s.toString();
    }
}
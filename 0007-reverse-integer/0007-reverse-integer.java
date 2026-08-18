class Solution {
    public int reverse(int x) {
    String s="";
    String s1=Integer.toString(x);
    int ln=s1.length();
    if(ln==1)return x;
    if(s1.charAt(ln-1)=='0')
    {ln=ln-1;
    }
    if(s1.charAt(0)=='-')
    {s+="-";
    for(int i=ln-1;i>=1;i--)
    {s+=s1.charAt(i);
    }
    }
    else
    {for(int i=ln-1;i>=0;i--)
    {s+=s1.charAt(i);
    }
    }
    long result=Long.parseLong(s);
    if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)
    {
        return 0;
    }   
    return (int)result;
    }
}
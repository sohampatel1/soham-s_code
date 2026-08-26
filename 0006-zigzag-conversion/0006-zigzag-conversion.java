class Solution {
    public String convert(String s, int numRows) {
    int n=s.length(),c=0;
    String[] a=new String[numRows];
    for(int i=0;i<numRows;i++) a[i]="";
    while(c<n)
    {for(int j=0;j<numRows;j++)
     {if(c<n)
     {a[j]+=s.charAt(c);
     c++;
     }
     }
     for(int j=numRows-2;j>0;j--)
     {if(c<n)
     {a[j]+=s.charAt(c);
     c++;
     }
     }
    }
    StringBuilder f=new StringBuilder();
    for(int i=0;i<numRows;i++) f.append(a[i]);
    return f.toString();
    }
}
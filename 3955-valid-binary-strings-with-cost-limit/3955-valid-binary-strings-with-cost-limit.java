class Solution {
    public List<String> generateValidStrings(int n, int k) {
    int s=0;
    List<String>ans=new ArrayList();
    for(int i=0;i<n;i++)
    {s+=Math.pow(2,i);
    }
    for(int i=0;i<=s;i++)
    {String a=Integer.toString(i,2);
    int l=a.length(),c=0,o=0;
    if(l!=n) o=n-l;
    if((a.codePointAt(0)-48)==1)c+=o;
    for(int j=1;j<l;j++)
    {if(((a.codePointAt(j)-48)==1) && ((a.codePointAt(j-1)-48)==1)) 
    {c=k+1;
    break;}
    else if((a.codePointAt(j)-48)==1) c+=j+o;
    }
    if(c<=k)
    {String finals=a;
    for(int j=0;j<o;j++) finals='0'+finals;
    ans.add(finals);
    }
    }
    return ans;  
    }
}
class Solution {
    public int maxProduct(String[] words) {
    int[] b=new int[words.length];
    int ans=0;
    for(int i=0;i<words.length;i++)
    {for(char c:words[i].toCharArray())
    {b[i]|=1<<(c-'a');
    }
    }
    for(int i=0;i<b.length;i++)
    {
    for(int j=i+1;j<b.length;j++)
    {if((b[i]&b[j])==0)
    {int d=words[i].length()*words[j].length();
    if(ans<d) ans=d;
    }
    }
    }
    return ans;    
    }
}
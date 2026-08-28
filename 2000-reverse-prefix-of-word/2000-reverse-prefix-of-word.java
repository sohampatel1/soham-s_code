class Solution {
    public String reversePrefix(String word, char ch) {
    int idx=word.indexOf(ch);
    if(idx==-1)return word;
    char[] ans=word.toCharArray();
    for(int i=0;i<=idx/2;i++)
    {char temp=ans[i];
    ans[i]=ans[idx-i];
    ans[idx-i]=temp;
    }
    return new String(ans);
    }
}
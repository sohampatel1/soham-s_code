class Solution {
    public int compress(char[] chars) {
   int c=0,n=chars.length,i=0,d=0;
    char a=chars[0];
    String s;
    while(i<n)
    {if(chars[i]==a) c++;
    else if(chars[i]!=a)
    {chars[d]=a;
    d++;
    if(c!=1 && c!=0) 
    {s=Integer.toString(c);
    for(int k=0;k<s.length();k++){
    chars[d]=s.charAt(k);
    d++;}
    }
    c=0;
    a=chars[i];
    i--;
    }
    if(i==n-1)
    {chars[d]=a;
    d++;
    if(c!=1 && c!=0) 
    {s=Integer.toString(c);
    for(int k=0;k<s.length();k++){
    chars[d]=s.charAt(k);
    d++;}
    }
    }
    i++;
    }
    return d;
    }
}
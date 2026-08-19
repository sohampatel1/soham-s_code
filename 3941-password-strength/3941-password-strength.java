class Solution {
    public int passwordStrength(String password) {
    int s=0;
    HashSet<Integer>b=new HashSet<>();
    for(int i=0;i<password.length();i++)
    {b.add(password.codePointAt(i));
    }
    for(int a:b){
    if(a>= 65 && a<=90) s+=2;
    else if(a>=97 && a<=122) s+=1;
    else if(a>=48 && a<=57) s+=3;
    else s+=5;
    }
    return s;   
    }
}
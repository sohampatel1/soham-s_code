class Solution {
    public String intToRoman(int num) {
    String Ans=a(num); 
    return Ans;    
    }
public String a(int n)
{int b,r,c,k;
String s="";
String ans;
if(n>=1000){k=1000; ans="M";}
else if(n>=900){k=900; ans="CM";}
else if(n>=500){k=500; ans="D";}
else if(n>=400){k=400; ans="CD";}
else if(n>=100){k=100; ans="C";}
else if(n>=90){k=90; ans="XC";}
else if(n>=50){k=50; ans="L";}
else if(n>=40){k=40; ans="XL";}
else if(n>=10){k=10; ans="X";}
else if(n>=9){k=9; ans="IX";}
else if(n>=5){k=5; ans="V";}
else if(n>=4){k=4; ans="IV";}
else {k=1; ans="I";}
r=n%k;
c=(n-r)/k;
for(int i=0;i<c;i++) s+=ans;
if(r==0)
{return s;}
else return s+a(r);
}}
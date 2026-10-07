class Solution {
     int reverse(int x) {
if(x<0||x==0) return 0;
int a=0;
while(x>0)
{if(a>INT_MAX/10) return 0;
a=a*10+x%10;
x/=10;
}
return a;
    }
public:
    bool isPalindrome(int x) {
        if(x==reverse(x)) return true;
        return false;   
    }
};
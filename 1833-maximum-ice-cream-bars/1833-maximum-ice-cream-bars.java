class Solution {
    public int maxIceCream(int[] costs, int coins) {
    Arrays.sort(costs);
    if(costs[0]>coins)return 0;
    int c=0,i=0;
    while(coins>0&&c<costs.length)
    {if((coins-costs[c])>=0)
    {coins-=costs[c];
    i++;
    c++;
    }
    else break;
    }
    return i;   
    }
}
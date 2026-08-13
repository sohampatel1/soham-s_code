class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    int[] a= new int[A.length];
    List<Integer>b=new ArrayList(); 
    for(int i=0;i<A.length;i++)
    {b.add(A[i]);
    int s=0;
    for(int j=0;j<=i;j++)
    {if(b.contains(B[j])) s++;
    }
    a[i]=s;
    }     
    return a;
    }
}
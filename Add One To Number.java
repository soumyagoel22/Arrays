import java.util.*; 

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
       int i,n;
       n=A.size();
       ArrayList<Integer> res = new ArrayList<Integer>(A);
       int d,a,carry;
       carry=1;
       for(i=n-1;i>=0;i--)
       {
           if(carry==0)
           break;
           d=A.get(i);
           a=d+carry;
           if(a>=10)
           {
               carry=a/10;
               d=a%10;
           }
           else
           {
               carry=0;
               d=a;
           }
           res.set(i,d);
       }
       if(carry!=0)
       res.add(0,1);
       int j=0;
       while(j<res.size() && res.get(j)==0)
       res.remove(j);
       return res;
    }
}

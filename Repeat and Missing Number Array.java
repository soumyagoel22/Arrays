import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A)
    {  
       ArrayList<Integer> b = new ArrayList<Integer>();
       int i,a;
       long tsum,sum,diff;
       long n;
       n=A.size();
       tsum = (n*(n+1))/2;
       sum=0;
       a=0;
       HashSet<Integer> hset = new HashSet<Integer>();
       for(i=0;i<n;i++)
       {
           if(hset.contains(A.get(i)))
           {
               a=A.get(i);
           }
           hset.add(A.get(i));
           sum+=A.get(i);
       }
       diff = tsum - sum;
       b.add(a);
       b.add(a+(int)diff);
       return b;
    }
}

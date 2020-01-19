import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        int i,j,n,val;
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        n=A;
        if(n==0)
        return B;
        for(i=0;i<n;i++)
        {
           ArrayList<Integer> b=new ArrayList<Integer>();
           for(j=0;j<=i;j++)
           {
               if(j==0 || i==j)
               {
                   b.add(1);
               }
               else 
               {
                   val=B.get(i-1).get(j-1)+B.get(i-1).get(j);
                   b.add(val);
               }
           }
           B.add(b);
        }
        return B;
    }
}

import java.util.*;

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
       Collections.sort(A);
       ArrayList<Integer> res = new ArrayList<Integer>();
       int i,n;
       n=A.size();
       for(i=1;i<n;i+=2)
       {
           res.add(A.get(i));
           res.add(A.get(i-1));
       }
       if(res.size()!=n)
       {
           res.add(A.get(n-1));
       }
       return res;
    }
}

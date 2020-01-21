import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> A) {
        Collections.sort(A);
        int i,n,a;
        n=A.size();
        for(i=1;i<n;i++)
        {
            if((A.get(i)).equals(A.get(i-1)))
            {
                a=A.get(i);
                return a;
            }
        }
        return -1;
    }
}

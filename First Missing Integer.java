import java.util.*;

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int i,a,n;
        a=1;
        n=A.size();
        Collections.sort(A);
        for(i=0;i<n;i++)
        {
            if(A.get(i)>0)
            {
                if(A.get(i)==a)
                {
                    a++;
                }
                else
                {
                    break;
                }
            }
        }
        return a;
    }
}

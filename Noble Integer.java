import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n=A.size();
        int i;
        if(A.get(n-1)==0)
        return 1;
        for(i=n-1;i>=0;i--)
        {
            if(i<n-1 && A.get(i)<A.get(i+1)){
            // continue;
            if(A.get(i)==(n-i-1))
            return 1;
            }
        }
        if()
        return -1;
    }
}

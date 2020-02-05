public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        int max=0;
        int i,n,gap=0;
        Collections.sort(A);
        n=A.size();
        if(n<2)
        return 0;
        for(i=1;i<n;i++)
        {
            gap=(A.get(i)-A.get(i-1));
            if(gap>max)
            max=gap;
        }
        return max;
    }
}

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int i,n,max,sum;
        n=A.size();
        max=A.get(0);
        sum=0;
        for(i=0;i<n;i++)
        {
            sum+=A.get(i);
            if(sum>max)
            max=sum;
            if(sum<0)
            sum=0;
        }
        return max;
    }
}

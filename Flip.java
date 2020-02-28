import java.util.*;

public class Solution {
     public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i,n,sum,left,right,maxleft,maxright,maxsum;
        sum=0;
        left=0;
        right=0;
        maxleft=0;
        maxright=0;
        maxsum=0;
        n=A.length();
        for(i=0;i<n;i++)
        {
            if(A.charAt(i)=='0')
            temp.add(1);
            else
            temp.add(-1);
        }
        for(i=0;i<n;i++)
        {
            sum+=temp.get(i);
            if(sum<0)
            {
                left=i+1;
                sum=0;
            }
            else
            {
                if(sum>maxsum)
                {
                    maxsum=sum;
                    maxleft=left;
                    maxright=i;
                }
            }
        }
        if(maxsum<=0)
        return ans;
        else
        {
            ans.add(maxleft+1);
            ans.add(maxright+1);
            return ans;
        }
    }
}

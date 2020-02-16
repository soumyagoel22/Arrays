import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST

    public int maximumGap(final List<Integer> a) {
       int i,j,n,max;
       n=a.size();
       int[] l = new int[n];
       int[] r = new int[n];
       l[0]=a.get(0);
       for(i=1;i<n;i++)
       {
           l[i] = (int)(Math.min(l[i-1],a.get(i)));
       }
       r[n-1]=a.get(n-1);
       for(i=n-2;i>=0;i--)
       {
           r[i]=(int)(Math.max(r[i+1],a.get(i)));
       }
       i=0;
       j=0;
       max=0;
       while(i<n && j<n)
       {
           if(l[i]<=r[j])
           {
               max = (int)(Math.max(max,j-i));
               j++;
           }
           else
           {
               i++;
           }
            }
       return max;
    }
}

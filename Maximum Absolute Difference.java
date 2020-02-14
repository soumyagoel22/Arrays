import java.util.*;

public class Solution {
    public int maxArr(ArrayList<Integer> A) {
      int i,max1,max2,min1,min2,n;
      max1=Integer.MIN_VALUE;
      max2=Integer.MIN_VALUE;
      min1=Integer.MAX_VALUE;
      min2=Integer.MAX_VALUE;
      n=A.size();
      for(i=0;i<n;i++)
      {
          max1 = (int)(Math.max(max1,A.get(i)+i));
          max2 = (int)(Math.max(max2,A.get(i)-i));
          min1 = (int)(Math.min(min1,A.get(i)+i));
          min2 = (int)(Math.min(min2,A.get(i)-i));
      }
      return (int)(Math.max(max1-min1,max2-min2));
    }
}

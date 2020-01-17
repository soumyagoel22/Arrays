import java.util.*;

public class Solution {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
       ArrayList<Integer> res = new ArrayList<Integer>();
       int m,n;
       m=A.size();
       n=A.get(0).size();
       int top,bottom,left,right,dir,i;
       top=0;
       bottom=m-1;
       left=0;
       right=n-1;
       dir=0;
       while(top<=bottom && left<=right)
       {
           if(dir==0)
           {
               for(i=left;i<=right;i++)
               {
                   res.add(A.get(top).get(i));
               }
               top++;
           }
           else if(dir==1)
           {
               for(i=top;i<=bottom;i++)
               {
                   res.add(A.get(i).get(right));
               }
               right--;
           }
           else if(dir==2)
           {
               for(i=right;i>=left;i--)
               {
                   res.add(A.get(bottom).get(i));
               }
               bottom--;
           }
           else if(dir==3)
           {
               for(i=bottom;i>=top;i--)
               {
                   res.add(A.get(i).get(left));
               }
               left++;
           }
           dir=(dir+1)%4;
       }
       return res;
    }
}

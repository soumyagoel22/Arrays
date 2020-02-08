import java.util.*;

public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
         Collections.sort(arrive);
         Collections.sort(depart);
         int i,j,n,m,reqroom;
         i=0;
         j=0;
         n=arrive.size();
         m=depart.size();
         reqroom=0;
         while(i<n && j<m && reqroom<=K)
         {
             if(arrive.get(i)<depart.get(j))
             {
                 reqroom++;
                 i++;
             }
             else
             {
                 reqroom--;
                 j++;
             }
         }
         if(reqroom<=K)
         return true;
         else
         return false;
    }
}

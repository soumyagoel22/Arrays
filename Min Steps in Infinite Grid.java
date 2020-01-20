public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
       int n,m;
       n=A.size();
       m=B.size();
       int i,d,d1,max,d2,d3;
       d=A.get(0);
       d1=B.get(0);
       max=0;
       if(n==1)
       return 0;
       for(i=1;i<n;i++)
       {
           d2=(int)(Math.abs(A.get(i)-d));
           d3=(int)(Math.abs(B.get(i)-d1));
           d=A.get(i);
           d1=B.get(i);
           max+=(int)(Math.max(d2,d3));
       }
       return max;
    }
}

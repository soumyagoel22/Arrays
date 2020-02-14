public class Solution {
    public int solve(ArrayList<String> A) {
       int i,n;
       n=A.size();
       double sum=0,d,d1,d2,dd;
        if(n<3)
        return 0;
           d=Double.parseDouble(A.get(0));
           d1=Double.parseDouble(A.get(1));
           d2=Double.parseDouble(A.get(2));
         for(i=3;i<n;i++)
         {
             sum = d+d1+d2;
             if(sum>1 && sum<2)
             return 1;
             dd = Double.parseDouble(A.get(i));
             if(sum>=2)
             {
                 if(d>d1 && d>d2)
                 d=dd;
                 else if(d1>d2)
                 d1=dd;
                 else
                 d2=dd;
             }
             else
             {
                 if(d<d1 && d<d2)
                 d=dd;
                 else if(d1<d2)
                 d1=dd;
                 else
                 d2=dd;
             }
         }
         if((d+d1+d2)>1 && (d+d1+d2)<2)
         return 1;
         else
         return 0;
    }
}

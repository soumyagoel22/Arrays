public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
       ArrayList<Integer> res = new ArrayList<Integer>(A);
       Collections.sort(A);
       ArrayList<Integer> b = new ArrayList<Integer>();
       int i,j,index1,index2,n;
       n=A.size();
       index1=-1;
       index2=-1;
       for(i=0;i<n;i++)
       {
           if(A.get(i)!=res.get(i))
           {
               index1 = i;
               break;
           }
       }
       for(j=n-1;j>=0;j--)
       {
           if(A.get(j)!=res.get(j))
           {
               index2 = j;
               break;
           }
       }
       if(index1==-1 && index2==-1)
       {
           b.add(-1);
       }
       else
       {
           b.add(index1);
           b.add(index2);
       }
       return b;
    }
}

public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
       int n=a.size();
       int index=-1;
       int i,j;
       for(i=n-1;i>0;i--)
       {
           if(a.get(i)>a.get(i-1))
           {
               index=i-1;
               break;
           }
       }
       if(index==-1)
       {
           Collections.sort(a);
       }
       else
       {
           int swap = -1;
           for(j=n-1;j>index;j--)
           {
               if(a.get(j)>a.get(index))
               {
                   swap=j;
                   break;
               }
           }
           int temp = a.get(index);
           a.set(index,a.get(swap));
           a.set(swap,temp);
           Collections.sort(a.subList(index+1,n));
           }
    }
}

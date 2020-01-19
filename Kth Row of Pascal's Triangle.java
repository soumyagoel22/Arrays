public class Solution {
    public ArrayList<Integer> getRow(int A) {
         int i,j,r,c,n,val;
        ArrayList<Integer> b=new ArrayList<Integer>();
        n=A;
        for(i=0;i<=n;i++)
        {
           if(i==n)
           {
           for(j=0;j<=i;j++)
           {
              val=pascalValue(i,j);
              b.add(val);
           }
           }
        }
        return b;
    }
     public static int pascalValue(int i, int j) {
        if (j == 0) 
        {
            return 1;
        } 
        else if (j == i)
        {
            return 1;
        } 
        else
        {
            return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
        }
    }
}

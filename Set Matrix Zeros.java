public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int i,j,n,m;
        n=a.size();
        m=a.get(0).size();
        boolean[] b = new boolean[n];
        boolean[] b1 = new boolean[m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if((a.get(i).get(j))==0)
                {
                    b[i]=true;
                    b1[j]=true;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(b[i]==true || b1[j]==true)
                a.get(i).set(j,0);
            }
        }
    }
}

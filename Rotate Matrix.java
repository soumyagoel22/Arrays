public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> A) {
        int n = A.size()-1;
        int i,j;
        for(i=0;i<A.size()/2;i++)
        {
            for(j=i;j<n-i;j++)
            {
                int t1 = A.get(n-j).get(i);
                int t2 = A.get(n-i).get(n-j);
                int t3 = A.get(j).get(n-i);
                int t4 = A.get(i).get(j);
                A.get(i).set(j,t1);
                A.get(n-j).set(i,t2);
                A.get(n-i).set(n-j,t3);
                A.get(j).set(n-i,t4);
            }
        }
    }
}

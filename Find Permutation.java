public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int min,max,i,n;
        min=1;
        max=B;
        n=A.length();
        for(i=0;i<n;i++)
        {
            if(min==max)
            break;
            if(A.charAt(i)=='I'){
            res.add(min);
            min++;
            }
            else{
            res.add(max);
            max--;
            }
        }
        res.add(min);
        return res;
    }
}

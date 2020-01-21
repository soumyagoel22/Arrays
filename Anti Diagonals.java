public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int m = A.size();
        int n = A.get(0).size();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(A.get(0).get(0));
        result.add(new ArrayList<Integer>(temp));
            int j;
            int i = 0;
            j = i+1;
            while(j < n){
                int k = i;
                int l = j;
                temp.clear();
                while(k < m && l >= 0){
                    temp.add(A.get(k).get(l));
                    k++;
                    l--;
                }
                result.add(new ArrayList<Integer>(temp));
                j++;
            }
            i = 1;
            j = n-1;
            while(i < m){
                int k = i;
                int l = j;
                temp.clear();
                while(k < m && l >= 0){
                    temp.add(A.get(k).get(l));
                    k++;
                    l--;
                }
                result.add(new ArrayList<Integer>(temp));
                i++;
            }
        temp.clear();
//        temp.add(A.get(m-1).get(n-1));
//        result.add(new ArrayList<Integer>(temp));
        return result;
    }
}

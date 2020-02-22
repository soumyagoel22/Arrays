import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> str = new ArrayList<String>();
        int i,n;
        n=A.size();
        for(Integer a : A)
        {
            str.add(String.valueOf(a));
        }
        Collections.sort(str,new Comparator<String>(){
            public int compare(String b, String b1)
            {
                return (b1+b).compareTo(b+b1);
            }
        });
        StringBuffer sb = new StringBuffer();
        for(String s : str)
        {
            sb.append(s);
        }
        if(sb.charAt(0)=='0')
        return String.valueOf(0);
        return sb.toString();
    }
}

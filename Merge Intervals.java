import java.util.*;

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
       Interval curr = newInterval;
       int i=0;
       while(i<intervals.size())
       {
           Interval in = intervals.get(i);
           if(in.start>curr.end)
           {
               intervals.add(i,curr);
               break;
           }
           else if(in.end<curr.start)
           {
               i++;
           }
           else
           {
               curr.start = Math.min(in.start,curr.start);
               curr.end = Math.max(in.end,curr.end);
               intervals.remove(i);
           }
       }
       if(i==intervals.size())
       {
           intervals.add(curr);
       }
       return intervals;
    }
}

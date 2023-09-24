//you are given n activities with their start and end times. Select the max no.
// of activities that can be performed by a singgle person assuming that a person
// can only work on a single activity at a time. Activities are sorted acc to end time

//eg: start= [10,12,20]      end = [20,25,30]       ans= 2(A0 and A2)

import java.util.*;
public class activityselection{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting
        int activities[][]=new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //labda function short form
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //1st activity
        maxAct=1;
        ans.add(0);       //ans.add(activities[0][0])
        int lastEnd=end[0];         //int lastEnd=activitites[0][2]
        for(int i=1; i<end.length; i++){
            if(start[i]>=lastEnd){      //activities[i][1]>=lastEnd
                //activity select
                maxAct++;
                ans.add(i);             //ans.add(activities[i][0])
                lastEnd=end[i];         //lastEnd=activities[i][2]
            }
        }

        System.out.println("Max Activities =" + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A" + ans.get(i));
        }
    }
}
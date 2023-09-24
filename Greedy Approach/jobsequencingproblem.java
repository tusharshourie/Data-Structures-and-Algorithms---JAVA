/* Given an array of jobs where deadline and profit if the job is finished before deadline
 * It is also given that even job takes a single unit of time, so the min possible
 * deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time
 */

/* Job A = 4,20
 * Job B=1,10
 * Job C=1,40
 * Job D = 1,30
 * 
 * ans = C,A
 */


import java.util.*;
public class jobsequencingproblem {
    static class Job{
        int deadline;
        int profit;
        int id;  //0(A)   1(B)    2(C)

        public Job(int i, int d, int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsinfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs= new ArrayList<>();

        for(int i=0; i<jobsinfo.length; i++){
            jobs.add(new Job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit-a.profit);  //desc ord of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time=0;
        for(int i=0; i<jobs.size(); i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }

        //print seq
        System.out.println("Max jobs = " + seq.size());

        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }    
}

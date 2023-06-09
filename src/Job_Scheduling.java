import java.util.ArrayList;
import java.util.Collections;

public class Job_Scheduling {

    char id;
    int deadline,profit;

    public Job_Scheduling(){}

    public Job_Scheduling(char id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    public static void main(String[] args) {
        // Create an ArrayList to store Job_Scheduling objects
        ArrayList<Job_Scheduling> arr=new ArrayList<>();

        // Add job objects to the ArrayList with their id, deadline, and profit values
        arr.add(new Job_Scheduling('1',5,55));
        arr.add(new Job_Scheduling('2',2,65));
        arr.add(new Job_Scheduling('3',7,75));
        arr.add(new Job_Scheduling('4',3,60));
        arr.add(new Job_Scheduling('5',2,70));
        arr.add(new Job_Scheduling('6',1,50));
        arr.add(new Job_Scheduling('7',4,85));
        arr.add(new Job_Scheduling('8',5,68));
        arr.add(new Job_Scheduling('9',3,45));

        System.out.println("Job Sequences to get the maximum profit");

        Job_Scheduling job=new Job_Scheduling();

        // Call the printjob method passing the ArrayList and maximum deadline as parameters
        job.printjob(arr,7);


    }

    // Method to print the job sequences to get the maximum profit
    private static void printjob(ArrayList<Job_Scheduling> arr, int maxdeadline) {
        int n=arr.size();

        // Sort the ArrayList in descending order based on profit using a lambda expression
        Collections.sort(arr,(a,b)->b.profit-a.profit);

        boolean result[]=new boolean[maxdeadline];

        char jobs[] =new char[maxdeadline];

        for(int i=0;i<n;i++)
        {
            // Iterate over the deadlines in reverse order, starting from the minimum between (maxdeadline-1) and (arr.get(i).deadline-1)
            // The purpose is to place the job in the latest possible slot without exceeding its deadline
            for(int j=Math.min(maxdeadline-1,arr.get(i).deadline-1);j>=0;j--)
            {
                if(result[j]==false)
                {
                    // If the current slot is available, assign the job to that slot
                    result[j]=true;
                    jobs[j]=arr.get(i).id;
                    break;
                }
            }
        }

        // Print the job sequences
        for(char id:jobs)
        {
            System.out.println(id+" ");
        }
        System.out.println();
    }
}

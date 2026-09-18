/*A company has one conference room that can be used by only one team at a time. Different teams have requested the room for meetings at different times.
The meeting schedule is:
Meeting A → 1 - 3
Meeting B → 2 - 4
Meeting C → 3 - 5
Meeting D → 5 - 7
Meeting E → 5 - 9
Meeting F → 8 - 10
A meeting can be scheduled if its start time is greater than or equal to the finish time of the previously selected meeting.
For example:
Meeting A: 1 - 3
Meeting C: 3 - 5
is valid because Meeting C starts exactly when Meeting A finishes.
Student Question
Using the Greedy Activity Selection Algorithm, write a Java program to:
1.	Store the meetings using an Activity class. 
2.	Sort the meetings according to their finish time. 
3.	Select the maximum number of non-overlapping meetings. 
4.	Display each selected meeting. 
5.	Display the maximum number of meetings that can be conducted.
6.	Given Input
7.	Activity[] activities = {
8.	    new Activity(1, 3),
9.	    new Activity(2, 4),
10.	    new Activity(3, 5),
11.	    new Activity(5, 7),
12.	    new Activity(5, 9),
13.	    new Activity(8, 10)
14.	};
15.	Expected Output
16.	Selected: 1 - 3
17.	Selected: 3 - 5
18.	Selected: 5 - 7
19.	Selected: 8 - 10
20.	
21.	Maximum activities = 4*/



package dsa;
import java.util.*;
class activity {
	int start;
	int finish;
	activity(int start, int finish) {
		this.start = start;
		this.finish = finish; 
	}
}
public class ActivitySelection {

	public static void main(String[] args) {
		activity[] activites = {
				new activity(1, 3),
				new activity(2, 4),
				new activity(3, 5),
				new activity(5, 7),
				new activity(5, 9),
				new activity(8, 10),
		};
		Arrays.sort(
			activites,Comparator.comparingInt(a -> a.finish)
		);
		int count = 1;
		int lastFinish = activites[0].finish;
		System.out.println(
				"Selected: " + activites[0].start + "-" + activites[0].finish );
		for (int i = 1; i < activites.length; i++) {
			if (activites[i].start >= lastFinish) {
				System.out.println("Selected: " + activites[i].start + " - " + activites[i].finish);
				count++;
				lastFinish = activites[i].finish;
			}
		}
		System.out.println("Maximum activites = " + count);
	

	}

}

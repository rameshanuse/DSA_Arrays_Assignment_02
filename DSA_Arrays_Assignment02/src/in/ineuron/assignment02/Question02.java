package in.ineuron.assignment02;

import java.util.HashSet;

/*

💡 Question 2
	Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she 
	started to gain weight, so she visited a doctor. 

	The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). 
	Alice likes her candies very much, and she wants to eat the maximum number of different types 
	of candies while still following the doctor's advice. 

	Given the integer array candyType of length n, return the maximum number of different types 
	of candies she can eat if she only eats n / 2 of them.

	Example 1:
	Input: candyType = [1,1,2,2,3,3]
	Output: 3

	Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can 
	eat one of each type.
 */
public class Question02 {

	public static int maxCandy(int[] candyType) {
		
		HashSet<Integer> unqueType = new HashSet<Integer>();
		for(int candy: candyType) {
			if(!unqueType.contains(candy)) {
				unqueType.add(candy);
			}
		}
		
		int uniquCandyCount = unqueType.size();
		int maxEat = candyType.length/2;
		
		maxEat = Math.min(uniquCandyCount, maxEat);
		
		return maxEat;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,2,2,3,3};
		int maxPairSum = maxCandy(nums);
		System.out.println("Number of candies she can eat is :: "+maxPairSum);
	}

}


public class Main {
	public static void main(String[] args) {
		
		/*
		 * Given an array of integers 'nums' and an integer 'target', 
		 * return indices of the two numbers such that they add up to 'target'
		 * [Example]
		 * Input: nums = [2,7,11,15], target = 9
		 * Output: [0,1]
		 * Explanation: nums[0] + nums[1] == 9, we return [0,1]
		 */
		
		int[] nums = {3,2,4,5};
		int target = 6;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println(nums[i] + "," + nums[j]);
				}
			}
		}
	}
}

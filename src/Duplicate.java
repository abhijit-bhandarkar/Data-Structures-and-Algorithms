

/**

	 * @author Abhijit Bhandarkar
	 *
	 * Given an array of size n + 1 with elements from 1 to n. One element is duplicated two times.
	 * Find that element in O(1) space. Array cannot be changed.
	 *
	 * Reference
	 * https://leetcode.com/problems/find-the-duplicate-number/
	 */

public class Duplicate{
	    public int findDuplicate(int[] nums) {
	        if (nums.length == 0 || nums.length == 1) {
	            return -1;
	        }

	        int slow = nums[0];
	        int fast = nums[nums[0]];
	        while (slow != fast) {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        }
	        fast = 0;
	        while (slow != fast) {
	            slow = nums[slow];
	            fast = nums[fast];
	        }

	        return fast;
	    }

	    public static void main(String args[]) {
	        int[] input = {2,1,3,4,5,6,6};
	        Duplicate dd = new Duplicate();
	        System.out.println(dd.findDuplicate(input));
	    }
	}
package easy;
//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

//Subscribe to see which companies asked this question

public class ContainsDuplicate2 {

	public boolean containsDuplicate(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}

}

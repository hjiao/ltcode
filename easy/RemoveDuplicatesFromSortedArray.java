package easy;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;

		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[j] != nums[i]) {
				nums[j++] = nums[i];
			}
		}
		return j + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package easy;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		int[] s = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					s[0] = i;
					s[1] = j;
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

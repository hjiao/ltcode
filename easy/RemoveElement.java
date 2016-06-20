package easy;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val){
				nums[j]= nums[i];
				j++;
			} 
			
		}

		return j;

	}

	public static int removeElement_x(int[] nums, int val) {

		if (nums == null)
			return 0;
		int n = nums.length;

		for (int i = 0; i < nums.length; i++) {
			while (nums[i] == val) {
				n--;
				for (int j = i; j < nums.length - 1; j++)
					nums[j] = nums[j + 1];
			}

		}

		for (int x : nums) {
			System.out.println(x);

		}
		System.out.println("n=" + n);
		return n;

	}

	public static void testFor() {
		// int[] nums = {1,3,6,10,8};
		int n = 20;
		for (int i = 0; i < n;) {

			System.out.println(i + "," + n);
			i++;
			n--;
		}

	}

	public static void main(String[] args) {
		// testFor();
		int[] nums = { 1, 3, 6, 3, 3, 10, 8 };

		removeElement_x(nums, 3);
	}

}

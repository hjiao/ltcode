package medium;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		if (nums.length == 1) {
			list.add("" + nums[0]);
			return list;
		}
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			for (int j = i; j < nums.length; j++) {
				if (j == nums.length - 1 || nums[j] + 1 != nums[j + 1]) {
					int b = nums[j];
					i = j;
					String x = a + "->" + b;
					list.add(x);
					break;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] ii = { 0, 1, 2, 4, 5, 7 };
		List list = summaryRanges(ii);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

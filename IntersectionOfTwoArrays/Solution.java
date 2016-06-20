package IntersectionOfTwoArrays;

import java.util.ArrayList;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {

		// #int l = nums1.length >= nums2.length ? nums1.length : nums2.length;
		// #int[] result = new int[l];
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int x : nums1) {
			for (int y : nums2) {
				if (x == y)
					result.add(x);
			}
		}
		
		for (Integar i : result)) {

		}
	}
}
package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		int[] intersection = new int[nums1.length >= nums2.length ? nums1.length : nums2.length];
		ArrayList<Integer> inter = new ArrayList<Integer>();
		int k = 0;
		for (int i : nums1) {
			for (int j : nums2) {
				if (i == j) {
					intersection[k] = i;
					k++;
				}
			}

		}
		int[] r = new int[k];
		System.arraycopy(intersection, 0, r, 0, k);
		// Integer[] a = inter.toArray()
		return r;

	}
	
	public int[] intersection2(int[] nums1, int[] nums2) {
		int[] intersection = new int[nums1.length >= nums2.length ? nums1.length : nums2.length];
		Set uniques = new HashSet();
		int k = 0;
		for (int i : nums1) {
			for (int j : nums2) {
				if (i == j) {
					uniques.add(i);
				}
			}

		}
		int[] r = new int[k];
		System.arraycopy(intersection, 0, r, 0, k);
		// Integer[] a = inter.toArray()
		return r;

	}

	public static void main(String[] args) {

	}

}

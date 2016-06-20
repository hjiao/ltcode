package medium;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

Subscribe to see which companies asked this question
*/

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {

		int n = s.length();
		int max = 0;
		int i = 0;
		int j = 0;
		Set<Character> set = new HashSet<>();

		while (i <= j && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = set.size() > max ? set.size() : max;
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

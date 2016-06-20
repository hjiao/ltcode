package removeduplicateletters;


public class RemoveDuplicateLetters {
	public static String removeDuplicateLetters(String s) {

		char[] c1 = s.toCharArray();
		char[] c2 = new char[c1.length];

		int n = 0;
		for (int i = 0; i < c1.length; i++) {
			boolean existing = false;
			for (int j = 0; j < n; j++) {
				if (c1[i] == c2[j]) {
					existing = true;
					break;
				}
			}
			if (!existing) {
				c2[n] = c1[i];
				n++;
			}
		}

		return new String(c2);
	}

	
	public static String removeDuplicateLetters2(String s) {
		
		return s;
	}
	private String remove(String s) {

		return s;
	}

	public static void main(String[] args) {
		
		System.out.println(removeDuplicateLetters("aabcdaaaa"));

	}
}
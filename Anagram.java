import java.util.*;

public class Anagram {

	public static boolean ang(String str, String str1) {
		// Complete this Code Snippet
		int n1 = str.length(), n2 = str1.length();
		if (n1 != n2) {
			return false;
		}
		// Complete the Code Snippet
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for (int i = 0; i < n1; i++) {
			freq1[str.charAt(i) - 'a']++;
			freq2[str1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (freq1[i] != freq2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str1 = in.nextLine();
		System.out.println(ang(str, str1));
	}
}

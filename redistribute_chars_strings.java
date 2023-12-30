//Leetcode question 1897

class Solution {
    public boolean makeEqual(String[] words) {
        if (words.length == 1) {
			return true;
		}
		int cnt = 0;
		for (String s : words) {
			cnt += s.length();
		}
		if (cnt % words.length != 0) {
			return false;
		}

		int[] map = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				map[c - 'a']++;
			}
		}
		for (int i : map) {
			if (i % words.length != 0) {
				return false;
			}
		}System.gc();
		return true; 
    }
}
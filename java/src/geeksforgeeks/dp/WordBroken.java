package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WordBroken {

	String s = "catsanddog";

	public static void main(String[] args) {
		WordBroken obj = new WordBroken();
		obj.callWordBroken();
		obj.checkArray();

	}

	private void checkArray() {
		int[][] ar = new int[10][10];
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(ar[i][j] + " ");
			}
		}

	}

	private void callWordBroken() {
		Set<String> dic = new HashSet<>();
		dic.add("cat");
		dic.add("cats");
		dic.add("and");
		dic.add("sand");
		dic.add("dog");
		ArrayList<String> l = wordBreak(s, dic);
		if (l == null) {
			System.out.println("Words cannot be broken");
		} else {
			for (String s : l) {
				System.out.println(s);
			}
		}

	}

	private ArrayList<String> wordBreak(String s2, Set<String> dic) {
		int len = s2.length();
		@SuppressWarnings({ "unchecked" })
		ArrayList<String>[] pos = new ArrayList[len + 1];
		pos[0] = new ArrayList<String>();
		for (int i = 0; i < len; i++) {
			if (pos[i] != null) {
				for (int j = i + 1; j <= len; j++) {
					String sub = s2.substring(i, j);
					if (dic.contains(sub)) {
						if (pos[j] == null) {
							ArrayList<String> temp = new ArrayList<>();
							temp.add(sub);
							pos[j] = temp;
						} else {
							pos[j].add(sub);
						}
					}
				}
			}
		}
		if (pos[len] == null)
			return null;
		else {
			ArrayList<String> r = new ArrayList<>();
			dfs(r, pos, "", len);
			return r;
		}
	}

	private void dfs(ArrayList<String> r, ArrayList<String>[] pos, String curr, int i) {
		if (i == 0) {
			r.add(curr.trim());
			return;
		}
		for (String s : pos[i]) {
			String str = s + " " + curr;
			dfs(r, pos, str, i - s.length());
		}

	}

}

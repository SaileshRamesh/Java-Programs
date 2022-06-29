package problems;

import java.util.Scanner;

public class Stones_On_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int i = 0, cnt = 0;
		char ch[] = s.toCharArray();
		if (s.length() == n) {
			for (i = 0; i < s.length() - 1; i++) {
				if (ch[i] == ch[i + 1]) {
					cnt++;
				}
			}
			System.out.println(cnt);
			sc.close();
		}
	}
}

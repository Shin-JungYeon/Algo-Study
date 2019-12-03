package week9;

import java.io.*;

/*
 * ����_1701_Cubeditor
 * 
 * failure function
 * � ���ڿ����� �� �� �̻� ������ �κ� ���ڿ� �߿��� ���� ���̰� �� ���� ���ϴ� ���α׷��� �ۼ�.
 * 
 * abcabcabc
 * ----------
 * 6
 * 
 * abc�� �� ��.
 * abcabc�� �� ��.
 * �� �� �̻� ������ �κ� ���ڿ� �߿��� ���� �� ���� abcabc.
 * 
 * abcdabcabb
 * ----------
 * 3
 * 
 * abcdeffgbbcbba		�̷� ���� ��� ����... �ϳ��� �ڷ� �о �� ������ �����ϳ���...?
 * ---------------
 * 2
 */
public class Problem_1701 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
//		int max = 0;
//		int cnt = 0;
//		StringBuilder sub = new StringBuilder();
//		
//		for(int i=0; i<s.length(); i++) {
//			sub.append(s.substring(i, i+1));
//			for(int j=0; j<s.length(); j++) {
//				if(s.substring(j, j+sub.length()).equals(sub.toString())) cnt++;
//				if(j+sub.length() == s.length()) break;
//			}
//			if(cnt > 1) {
//				max = Math.max(max, sub.length());		
//			}
//			cnt = 0;
//		}
//		System.out.println(max);
		
		StringBuilder sub = new StringBuilder();
		int[] pattern = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			sub.append(s.charAt(i));
			int k = 0;
			for(int j=1; j<sub.length(); j++) {
				if(sub.charAt(k) == sub.charAt(j)) {
					pattern[i] += 1;
					k++;
				}
			}
		}
		
		int max = 0;
		for(int p : pattern) {
			max = Math.max(max, p);
		}
		System.out.println(max);
	}
}

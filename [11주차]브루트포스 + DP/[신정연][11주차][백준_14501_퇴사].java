package week11;

import java.util.*;
/*
 * ����_14501_���
 * ��� �� �� �� �ִ� ����� �ִ� ���� ���.
 * 
 * 7		N : N+1�Ͽ� ���
 * 3 10		T P : �ɸ��� �Ⱓ ����
 * 5 20
 * 1 10
 * 1 20
 * 2 15
 * 4 40
 * 2 200
 * ------
 * 45
 */
public class Problem_14501 {
	static int N;
	static int[][] timePay;
//	static int[] memo;
	
	static int func(int idx) {
		if(timePay[idx][0] + idx > N) return 0;
		if(timePay[idx][0] + idx == N) return timePay[idx][1];
		int max = timePay[idx][1];
		for(int i=idx + timePay[idx][0]; i<N; i++) {
			max = Math.max(func(i) + timePay[idx][1], max);
		}
//		if(memo[idx] == 0) {
//			return memo[idx] = max;
//		}
//		return memo[idx];
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		timePay = new int[N][2];
//		memo = new int[N];
		
		for(int i=0; i<N; i++) {
			timePay[i][0] = sc.nextInt();  // �ɸ��� �Ⱓ
			timePay[i][1] = sc.nextInt();  // ����
		}
		
		int max = 0;
		for(int i=0; i<N; i++) {
			max = Math.max(func(i), max);
		}
		System.out.println(max);
	}
}

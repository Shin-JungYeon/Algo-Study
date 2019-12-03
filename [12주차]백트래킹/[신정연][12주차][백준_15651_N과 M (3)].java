package week12;

import java.util.*;

/*
 * ����_15649_N�� M(3)
 */
public class Problem_15651 {
	static int N;
	static int M;
	static StringBuffer result = new StringBuffer();

	static void select(int cnt, StringBuffer sb) {
		if(cnt == M) {
//        	System.out.println(sb);  // ���� ������ ������ �ϳ��ϳ� ����ϸ� ���� �ɸ�. -> �ð��ʰ�..�̤�
			result.append(sb.append("\n"));
			return;
		}
		for(int i=1; i<=N; i++) { // �ߺ��� ����ϱ� ������ vst�˻����� ����.
			select(cnt + 1, new StringBuffer(sb).append(i + " "));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		select(0, new StringBuffer());
		System.out.println(result);
	}
}

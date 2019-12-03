package week8;

import java.util.*;

/*
 * ����_11399_ATM
 * 
 * ATM�� �� ��, ����� N��. ������� ���� �̴µ� �ɸ��� �ð��� �ٸ�.
 * �� ����� ��ٸ��� �ð��� �� �� �ּڰ� ���.
 * 
 * 5
 * 3 1 4 3 2
 * ----------
 * 32	(1) + (1+2) + (1+2+3) + (1+2+3+3) + (1+2+3+3+4)
 */
public class Problem_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> minutes = new ArrayList<>();;
		for(int i=0; i<N; i++) {
			minutes.add(sc.nextInt());
		}
		
		Collections.sort(minutes);  // ����.
		int sum = 0; // ��ٸ��� �ð��� ���� ��
		int minTime = 0;  // ���� ���� ���� ��.
		for(int i=0; i<N; i++) {
			sum += minutes.get(i);
			minTime += sum;
		}
		System.out.println(minTime);
	}
}

package week8;

import java.util.*;

/*
 * ����_2217_����
 * 
 * ������ �� �� �ִ� ��ü�� �ִ� �߷��� �־��� �� �� �� �ִ� ��ü�� �ִ� �߷� ���.
 * ��� ������ ����� �ʿ�� ����.
 * 
 * 2	N : ������ ����
 * 10	������ �� �� �ִ� ��ü�� �ִ� �߷�
 * 15
 * ---
 * 20	�������� ����Ͽ� �� �� �ִ� ��ü�� �ִ� �߷�
 * 
 * 6
 * 15
 * 5
 * 20
 * 35
 * 40
 * 45
 * ---
 * 5*6	30
 * 15*5 75
 * 20*4 80
 * 35*3 105
 * 40*2 80
 * 45*1 45
 */
public class Problem_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> ropes = new ArrayList<>();
		for(int i=0; i<N; i++) {
			ropes.add(sc.nextInt());
		}
		
		Collections.sort(ropes);  // ����..
		int max = 0;
		for(int i=0; i<ropes.size(); i++) {
			max = Math.max(max, ropes.get(i)*N);  // ���� ���� ��ü�� �� �� �ִ� ������ ����ϸ� �� �߷���ŭ ��� 1/N�ؼ� ��� ��.. ���� �� �ϳ��� �����鼭...�׷���..
			N--;
		}
		System.out.println(max);
		
	}
}

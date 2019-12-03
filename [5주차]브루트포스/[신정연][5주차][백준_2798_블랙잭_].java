package week5;

import java.util.*;

/*
 * ����_2798_����
 * 
 * ī�� 3���� ������ �� �־��� ���ڸ� ���� �����鼭 ���� ����� �� ���ϱ�
 * 
 * 5 21			: ī��� ����
 * 5 6 7 8 9	: ī��
 * ----------
 * 21
 */
public class Problem_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cards = new int[sc.nextInt()];
		int num = sc.nextInt();
		int len = cards.length;
		
		for(int i=0; i<len; i++) {
			cards[i] = sc.nextInt();
		}
		
		int min = num;
		int sum = 0;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if(i==j) continue;
				for(int k=0; k<len; k++) {
					if(i==k || j==k) continue;
					sum = cards[i]+cards[j]+cards[k];
					if(sum <= num) {						
						min = Math.min(min, num-sum);
					}
				}
			}
		}
		System.out.println(num-min);
	}
}

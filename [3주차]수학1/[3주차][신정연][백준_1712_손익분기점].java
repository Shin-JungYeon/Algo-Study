package week3;

import java.util.*;

/*
 * ����_1712_���ͺб���
 * 
 * A : ���� ���
 * B : ���� ���
 * C : ��Ʈ�� �� �� ����
 * 
 * �� ��� = A + B*(��Ʈ�� ���)
 * �� ���� = C*(��Ʈ�� ���)
 * 
 * 1000 70 170 > 11
 */
public class Problem_1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		// �����л��� �����ϱ� ��. bep�� �������� �ʴ� ���(���ѷ���)�� ó������ ����. A, B, C, bep �� ������ �Դٰ��� �� �ô��� bep�� ������ ������ ����. �׷�����..
//		int bep = 0;  // ���ͺб��� ���� ����
//		
//		while(true) {  // �̷��� �ݺ��� �󸶳� �ϰ� ����... �ƹ��� ����.. �ð����⵵ ������ϰ� Ŀ��������...
//			bep++;
//			if((A + B*bep) < (C*bep)) {  // �� ��� < �� ����
//				// A + (B-C)*bep = 0
//				// bep = -A/(B-C)  -> bep ���� �Ϸ��� B-C < 0 �̾����(bep�� �ڿ������״ϱ�..?)
//				System.out.println(bep);
//				break;
//			}
//		}
		
		if(B-C < 0) {
			System.out.println(-A/(B-C)+1);
		} else {
			System.out.println(-1);
		}
		
	}
}
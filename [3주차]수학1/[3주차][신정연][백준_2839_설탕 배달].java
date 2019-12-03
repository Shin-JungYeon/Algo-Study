package week3;

import java.util.*;

/*
 * ����_2839_���� ���
 * 
 * ��Ȯ�ϰ� N kg ���
 * 3 kg ����, 5 kg ����
 * ��޿� �ʿ��� ������ �ּ� ����
 * ��Ȯ�ϰ� N kg�� ���� ������ -1 ���
 * 
 * 18 >  4
 * 4  > -1
 * 6  >  2
 * 9  >  3
 * 11 >  3
 */
public class Problem_2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kg = scan.nextInt();
		int originKg = kg;
		int cnt = 0;
		
		while(true) {
			if(kg%5 == 0) {  // 5 kg���θ� �̷����.
				System.out.println(kg/5);
				break;
			} else if(kg > 0) {  // 3�� ��� ���ٰ� ������ �ʰ� 0�Ʒ��� ��������
				kg -= 3;
				cnt++;  // 3 kg ������ ����
				if(kg%5 == 0) {  // 3kg �� �������� 5�� ���� �������� 3kg�� (cnt)��, 5kg�� (kg/5)�� �� ��ü ����.
					System.out.println(kg/5 + cnt);
					break;
				}
			} else {  // 3�� ��� ���ٰ� ������ �ʰ� 0�Ʒ��� �������� 3kg�� 5kg�� ȥ�����δ� �ȵ�.
				if(originKg%3 == 0) {  // 3 kg���θ� �̷����.
					System.out.println(originKg/3);
					break;
				} else {
					System.out.println(-1);
					break;					
				}
			}		
		}
		
	}
}

package week5;

import java.util.*;

/* 
 * ����_1436_��ȭ���� ��
 * 
 * 6�� ��� 3�� �̻� �� �� �� n��° �� ���ϱ�
 * 
 * 2
 * -----
 * 1666
 */
public class Problem_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String six = "666";
		String number = six;
		int cnt = 0;
		while(true) {
			if(number.contains(six)) {
				cnt++;
			}
			if(cnt==n) {
				System.out.println(number);
				break;
			}
			number = Integer.toString(Integer.parseInt(number)+1);
		}
	}
}

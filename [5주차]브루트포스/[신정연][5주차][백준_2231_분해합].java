package week5;

import java.util.*;

/*
 * ����_2231_������
 * 
 * 245 -> 245 + 2 + 4 + 5 = 256
 * 245�� 256�� ������
 * ���� ���� ������ ���ϱ�
 * 
 * 216
 * ----
 * 198
 */
public class Problem_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int con = 0;
//		int temp = con;
//		int sum = con;

		for(int i=0; i<num; i++) {
			int temp = i;
			int sum = i;
			while(temp > 0) {
				sum += temp%10;
				temp = temp/10;
			}
			
			if(sum == num)  {
				con = i;
				break;
			}
		}
		System.out.println(con);
		
		
//		while(true) {
//			while(temp > 0) {
//				sum += temp%10;
//				temp = temp/10;
//			}
//			
//			if(sum == num)  {
//				System.out.println(con);
//				break;
//			}
//			
//			con++;
//			sum = con;
//			temp = con;
//		}
	}
}


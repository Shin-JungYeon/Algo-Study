package week10;

import java.util.*;

/*
 * ����_1730_����
 * 
 * (1 �� x �� 20)
 * add x: S�� x�� �߰�.
 * remove x: S���� x�� ����.
 * check x: S�� x�� ������ 1��, ������ 0�� ���.
 * toggle x: S�� x�� ������ x�� �����ϰ�, ������ x�� �߰�.
 * all: S�� {1, 2, ..., 20} ���� �ٲ�.
 * empty: S�� ���������� �ٲ�.
 * check ������ �־���������, ����� ���.
 */
public class Problem_11723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();  // ������ ��
		int S = 1;
		List<Integer> check = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			String inst = sc.next();
			int x = 0;
			if(!(inst.equals("all") || inst.equals("empty"))) {
				x = sc.nextInt();
			}
			
			switch(inst) {
			case "add" :
				if((S & (1 << x)) <= 1) {  // �ش� ��Ʈ ���� ����(�������� ����).
					S = S | (1 << x);  // �߰�(or ������ ������ 1�� �ٲ��ִϱ�)
				}
				break;
			case "remove" :
				if((S & (1 << x)) > 1) {  // �ش� ��Ʈ ���� ����(������).
					S = S & ~(1 << x);  // ����(���� �ִ� ��Ʈ�� not�� 0�̰�, 0�̶� and �����ϸ� ������ 0)
				}
				break;
			case "check" :
				if((S & (1 << x)) > 1) {
//					System.out.println(1);
					check.add(1);
				} else {
//					System.out.println(0);
					check.add(0);
				}
				break;
			case "toggle" :
				if((S & (1 << x)) > 1) {  // �ش� ��Ʈ ���� ����(������).
					S = S & ~(1 << x);  // ����
				} else {
					S = S | (1 << x);  // �߰�
				}
//				S = S ^ (1 << x);  // ���
				break;
			case "all" :
				S = (1<<21)-1;
				break;
			case "empty" :
				S = 1;
				break;
			}
		}
		
		for(int c : check) {
			System.out.println(c);
		}
		
//		Scanner sc = new Scanner(System.in);
//		boolean[] arr = new boolean[21];
//		int n = sc.nextInt();
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < n; i++) {
//			String s = sc.next();
//			switch (s) {
//			case "add":
//				arr[sc.nextInt()] = true;
//				break;
//			case "remove":
//				arr[sc.nextInt()] = false;
//				break;
//			case "toggle":
//				int x = sc.nextInt();
//				arr[x] = !arr[x];
//				break;
//			case "check":
//				sb.append((arr[sc.nextInt()] ? 1 : 0) + "\n");
//				break;
//			case "all":
//				for (int j = 0; j < 21; j++)
//					arr[j] = true;
//				break;
//			case "empty":
//				for (int j = 0; j < 21; j++)
//					arr[j] = false;
//				break;
//			}
//		}
//		System.out.println(sb.toString());
	}
}

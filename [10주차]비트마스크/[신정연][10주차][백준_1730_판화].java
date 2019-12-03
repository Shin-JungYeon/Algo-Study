package week10;

import java.io.*;

/*
 * ����_1730_��ȭ
 * 
 * ������ ���� ���� '.'
 * ���� �������θ� ���� ���� '|'
 * ���� �������θ� ���� ���� '-'
 * ������ ���� ���� ��η� ���� ���� '+'
 * 'U' ��������	46		10 1110
 * 'D' �Ʒ�������	124		11 1100
 * 'L' ��������	45		10 1101
 * 'R' ����������	43		10 1011
 * 
 * 6		n : ������ ũ�� (2<=n<=100)
 * DRDRRUU
 * --------
 * |..|..
 * ++.|..
 * .+-+..
 * ......
 * ......
 * ......
 */
public class Problem_1730 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String inst = br.readLine();
		
		char[][] result = new char[n][n];
		int[][] turn = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				result[i][j] = '.';
			}
		}
		
		int idx = 0;
		int jdx = 0;
		
		for(int i=0; i<inst.length(); i++) {
			if(inst.charAt(i) == 'U' || inst.charAt(i) == 'D') {
				if(turn[idx][jdx] == 2) {  // '-' �� ���� ��
					result[idx][jdx] = '+';	
				} else {
					result[idx][jdx] = '|';					
				}
			} else {
				if(turn[idx][jdx] == 1) {  // '|' �� ���� ��
					result[idx][jdx] = '+';
				} else {
					result[idx][jdx] = '-';					
				}
			}
			
			switch(inst.charAt(i)) {
			case 'U' :
				idx--;
				result[idx][jdx] = '|';
				turn[idx][jdx] = 1;
				break;
			case 'D' :
				idx++;
				result[idx][jdx] = '|';
				turn[idx][jdx] = 1;
				break;
			case 'R' :
				jdx++;
				result[idx][jdx] = '-';
				turn[idx][jdx] = 2;
				break;
			case 'L' :
				jdx--;
				result[idx][jdx] = '-';
				turn[idx][jdx] = 2;
				break;
			}
			if(idx > n) idx--;
			else if(jdx > n) jdx--;
			else if(idx < 0) idx++;
			else if(jdx < 0) jdx++;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}

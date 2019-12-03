package week8;

import java.io.*;

/*
 * ����_1541_�Ҿ���� ��ȣ
 * 
 * +�� -�θ� �־��� �Ŀ��� ��ȣ�� �ļ� �ּ� ��� ���.
 * 
 * 55-50+40
 * --------
 * -35
 */
public class Problem_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mathEx = br.readLine();
		String[] minusNums = mathEx.split("-");  // "-"�� �������� ������ ����. "-" ���� "+"������ ������ ���� ����ؼ� ���ָ� ���� ���� �۾��� ���̶�� ����.
		int result = 0;
		
		for(int i=0; i<minusNums.length; i++) {
			if(i==0) {  // �� �տ� ���ڸ� ���� �׳� �����ְ� "+"������ ������ ��� �� ������� ����.
				if(minusNums[i].contains("+")) {
					String[] plusNums = minusNums[i].split("\\+");
					for(int j=0; j<plusNums.length; j++) {
						result += Integer.parseInt(plusNums[j]);
					}
				} else {
					result += Integer.parseInt(minusNums[i]);					
				}
			} else {  // "-"���� "+"����. ��� �� ��������� ��.
				if(minusNums[i].contains("+")) {
					int plus = 0;
					String[] plusNums = minusNums[i].split("\\+");
					for(int j=0; j<plusNums.length; j++) {
						plus += Integer.parseInt(plusNums[j]);
					}
					result -= plus;
				} else {
					result -= Integer.parseInt(minusNums[i]);
				}
			}
		}
		System.out.println(result);
	}
}

package baekjoon_brute_force;
import java.util.*;
public class baekjoon_2798 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int blackjack = sc.nextInt();
        int [] arr = new int [r];
        for(int i=0; i<r; i++) arr[i] = sc.nextInt();
        int result = 0;
        for(int i = 0; i < r-2; i++) {
        	for(int j = i+1; j < r-1; j++) {
        		for(int k = j+1; k < r; k++) {
        			int sum = arr[i] + arr[j] + arr[k];
        			// ���� result���� ũ���� blackjack ���ٴ� ���� ��.
        			// ���� �� �ִ� ���� �� ū ��
        			if(result<sum && sum<=blackjack)result=sum;
        		}
        	}
        }
        System.out.println(result);
    }
}

package week6;

import java.util.*;

/*
 * ����_7576_�丶��
 * 
 * BFS�� �丶�� ������ ����. ť...........
 * 
 * 1	���� �丶��
 * 0	�� ���� �丶��
 * -1	�������
 * 
 * 6 4
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 1
 * ------------
 * 8				�� �ʹ� �� �ɸ��� �ּ� �� ��
 * 
 * 6 4
 * 0 -1 0 0 0 0
 * -1 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 1
 * -------------
 * -1				�� ���� ����
 */
class box {
	int x;
	int y;
	public box(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Problem_7576_2 {
	static int[][] arr;
	static Queue<box> q = new LinkedList<>();
	static List<box> visited;
	static int days;
	static int m;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		arr = new int[n+2][m+2];
		visited = new ArrayList<>();;
	
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(arr[i][j] == 1) {
					box b = new box(i, j);
					q.offer(b);  // ���� �丶�䰡 �ִ� ��ġ ���� ����.
					visited.add(b);  // �湮�� ��ġ���� ����.
				}
			}
		}
		
		
		bfs(arr);
		boolean possiblity = true;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(!visited.contains(new box(i, j)) && arr[i][j] == 0) {  // �湮�� ���ߴµ� 0�̸� ��� ���� �� ���� �丶����.
					possiblity = false;
				}
			}
		}
		
		if(possiblity) {
			System.out.println(days-1);			
		} else {
			System.out.println(-1);
		}
	}
	
	public static void bfs(int[][] arr) {
		box b;
		int x;
		int y;
		int size = q.size();  // bfs() ȣ����� �� q�� ������.
		
//		Queue<box> temp = new LinkedList<>();  // �̷��� �ϸ� q�� ���� �����ϴ°��ݾ�..!
//		
//		while(!q.isEmpty()) {
//			b = q.poll();
//			temp.poll();
//			x = b.x;
//			y = b.y;
//			int[] xs = {x, x, (x-1), (x+1)};
//			int[] ys = {(y-1), (y+1), y, y};
//			
//			for(int j=0; j<xs.length; j++) {
//				if(x>0 && y>0 && x<m+1 && y<n+1) {
//					box bb = new box(xs[j], ys[j]);
//					if(arr[xs[j]][ys[j]] == 0) {					
//						arr[xs[j]][ys[j]] = 1;							
//						q.offer(bb);
//						visited.add(bb);
//					}
//				}
//			}
//		}
		
		for(int i=0; i<size; i++) {  // while ���� ������.. q�� �ڲ� �߰��Ǹ�... �����..
			b = q.poll();
			x = b.x;
			y = b.y;
			int[] xs = {x, x, (x-1), (x+1)};
			int[] ys = {(y-1), (y+1), y, y};
			
			for(int j=0; j<xs.length; j++) {
				if(x>0 && y>0 && x<m+1 && y<n+1) {
					box bb = new box(xs[j], ys[j]);
					if(arr[xs[j]][ys[j]] == 0) {					
						arr[xs[j]][ys[j]] = 1;							
						q.offer(bb);
						visited.add(bb);
					}
				}
			}
		}
		if(!q.isEmpty()) {
			days++;
			bfs(arr);
		}
	}
}


package week6;

import java.util.*;

/*
 * ����_1260_DFS�� BFS
 * 
 * 4 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 * --------
 * 1 2 4 3
 * 1 2 3 4
 * 
 * 5 5 3
 * 5 4
 * 5 2
 * 1 2
 * 3 4
 * 3 1
 * ----------
 * 3 1 2 5 4
 * 3 1 4 2 5
 */
public class Problem_1260 {
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	// ���� ��
		int M = sc.nextInt();	// ���� ��
		int V = sc.nextInt();	// ������
		
		int[][] arr = new int[N+1][N+1];
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		List<Integer> list = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		list.add(V);
		
		result = dfs(V, arr, list);
		for(int i=0; i<result.size(); i++ ) {
			System.out.print((i!=result.size()-1)?result.get(i)+" ":result.get(i));
		}
		
		System.out.println();
		
		Queue<Integer> q = new LinkedList<>();  // �߰��� ������ ������� �����ϰ� ���� queue
		list = new ArrayList<>();  // ��� ���� list
		list.add(V);  // ���� ���� ����.
		result = bfs(V, arr, list, q);  // ������, �׷��� ����, ���, ť
		for(int i=0; i<result.size(); i++ ) {
			System.out.print((i!=result.size()-1)?result.get(i)+" ":result.get(i));
		}
	}
	
	public static List<Integer> dfs(int v, int[][] arr, List<Integer> list) {
		if(list.size() == N) {
			return list;
		}
		
		for(int i=1; i<arr.length; i++) {
			if((arr[v][i] == 1) && !list.contains(i)) {
				list.add(i);
				return dfs(i, arr, list);
			}
		}
		
		return list;
	}
	
	public static List<Integer> bfs(int v, int[][] arr, List<Integer> list, Queue<Integer> q) {
		if(list.size() == N) {
			return list;
		}
		
		for(int i=1; i<arr[v].length; i++) {
			if(arr[v][i] == 1) {
				if(!q.contains(i) && !list.contains(i)) {
					q.offer(i);  // ���� ���� �ϴ� �� ť�� ����.		
				}
			}
		}
		
		while(!q.isEmpty()) {		
			int now = q.poll();
			if(!list.contains(now)) {
				list.add(now);
				return bfs(now, arr, list, q);
			}
		}
		
		return list;
	}
}

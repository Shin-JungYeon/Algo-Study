package week6;

class Node {
	int data;
	Node next = null;
	
	Node(int d) {
		this.data = d;
	}
	
	void append(int d) {  // ������ �߰�.
		Node end = new Node(d);  // ���� ���� �߰��� ��� ��ü ����.
		Node n = this;  // ��忡 ���� ��� ���� ����.
		while(n.next != null) {  // ������ null�� �ƴ� ��� ��� ����. -> ������ ���� ��.
			n = n.next;
		}
		n.next = end;  // ������ ����� next�� ���� ��� ���� �־���.
	}
	
	void delete(int d) {
		Node n = this;
		while(n.next != null) {
			if(n.next.data == d) {  // ���� ����� ���� ��尡 ������� �����͸� ���� ����̸�, �����ϰ� ���� ��� ������ �������� ��� ������ �ٲ�.
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = this;
		while(n.next != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println(n.data);  // ������ �����ʹ� ��� ���ϰ� while�� �����������Ƿ� �������.
	}
}

public class SinglyLinkedList {	
	public static void main(String[] args) {
		Node head = new Node(0);
		head.append(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.append(5);
		head.retrieve();
		head.delete(3);
		head.retrieve();
	}
}

package list.linkedlist.implementation;

public class LinkedList {
	// ���� ���� ù��°�ΰ�?
	// ���� ���� ���� �ִ°�?
	// ����Ʈ�� ������
	private Node head;
	private Node tail;
	private int size=0;
	
	// ArrayList�� �迭�� �̿��ϴ� �Ͱ� �޸�
	// LinkedList�� ��ü���� ���� ����
	
	/*
	 * [����]
	 * 1. addFirst - ù��° ��ġ�� ��� �ֱ�
	 * 2. addLast - ������ ��ġ
	 * 3. ���� API
	 * 4. add - ���ϴ� ��ġ�� �߰�
	 * 5. toString() - ���ڿ� ��ȯ
	 * 6. removeFirst - ù��° ��ġ ��� ����
	 */
	
	private class Node{
		private Object data;
		// ���� ������Ʈ�� ������ ��� �ִ� next ������ Ÿ���� ��尡 �ȴ�.
		private Node next;

		// input - ����Ʈ���� ��尡 �����ɶ� ���� ���� ���´�.
		public Node(Object input) {
			this.data=input;
			this.next=null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	// input ���� �޾Ƽ� Node ��ü�� ����� ���� �߿�
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next==null) {
			tail=head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size==0) {
			addFirst(input);
		} else { // data�� ������ ���
			// tail�� ����Ű�� node�� ���Ӱ� �߰��Ǵ� ��尡 �ȴٸ�...
			tail.next=newNode;
			tail=newNode;
			size++;
		}
	}
	
	// ����ڿ��� ����Ǹ� �ȵǴ� ��ǰ.
	Node node(int index) {
		Node x=head;
		for(int i=0; i<index; i++) {
			x=x.next;
		}
		return x;
	}
	
	// �߰��ϰ����ϴ� ��ġ�� ���� ��带 �˰� �־�� �Ѵ�.
	// ���� ����� next�� ���ϴ� ��ġ�� ��嵵 �� �� �ִ�.
	public void add(int k, Object input) {
		if(k==0) {
			addFirst(input);
		} else {
			Node temp1=node(k-1);
			Node temp2=temp1.next;
			
			Node newNode = new Node(input);
			temp1.next=newNode;
			newNode.next=temp2;
			size++;
			if(newNode.next==null) {
				tail=newNode;
			}
		}
	}
	
	public String toString() {
		if(head==null) {
			return "[]";
		}
		Node temp=head;
		String str="[";
		
		while(temp.next != null) {
			str += temp.data +", ";
			temp=temp.next;
		}
		str += temp.data;
		
		return str+"]";
	}

	public Object removeFirst() {
		Node temp=head;
		head=head.next;
		Object returnData = temp.data;
		temp=null;
		size--;
		return returnData;
	}
	
	
}

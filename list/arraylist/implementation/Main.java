package list.arraylist.implementation;

public class Main {
	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		// 15�� 10������ �ְ����Ѵ�.
		// �����͸� Ư�� ��ġ�� �ְ��� �Ѵٸ� Ư���� ��ġ�� ������Ʈ�� �����ؼ�
		// ��� ������Ʈ���� ��ĭ�� �ڷ� �Űܾ� �Ѵ�.
		// �̰��� ArrayList�� �ִ� �����̴�.
		numbers.add(1, 15);
		numbers.addFirst(5);
		
	
	}
}

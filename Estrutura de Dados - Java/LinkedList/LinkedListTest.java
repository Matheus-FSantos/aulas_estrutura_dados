package LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		System.out.println(linkedList.toString() + ", Length = " + linkedList.getLength());
		System.out.println(linkedList.getByElement(1));
		System.out.println(linkedList.getById(4));
		
		linkedList.clear();
		System.out.println(linkedList.toString());
		linkedList.add(22);
		System.out.println(linkedList.toString());
	}
}
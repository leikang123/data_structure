package lk.com2.lb;

public class Demo01 {
	public static void main(String[] args) {
		  
			Demo01 de = new Demo01();
			de.ListLength(null);

	}

	public int  ListLength(ListNode headNode) {
		int length = 0;
		ListNode currentNode = headNode;
		while(currentNode !=null) {
			length++;
			currentNode = currentNode.getNext();
			
		}
		return length;
		
		
	}

}

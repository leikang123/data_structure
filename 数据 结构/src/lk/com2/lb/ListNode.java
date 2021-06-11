package lk.com2.lb;
/**
 * 单向连表
 * @author mac1094
 *
 */

public class ListNode {
	// 连表的属性
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	

}

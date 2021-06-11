package 数组2;
/**
 * 数组训练
 * @author mac1094
 *
 */
 // 建立节点类
public class Node {
	// 节点上有数字属性
	int data;
	// 姓名
	String name;
	// 成绩
	int np;
	// 指向下一个节点
   Node next;
	public Node(int data, String name, int np) {
		super();
		this.data = data;
		this.name = name;
		this.np = np;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNp() {
		return np;
	}
	public void setNp(int np) {
		this.np = np;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
    
   
	

}

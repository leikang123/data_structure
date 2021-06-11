package 双向队列;
/**
 * 双向队列的实现方法
 * @author mac1094
 *
 */
// 节点类
public class Node {
	// 数据
	int data;
	// 指针
    Node next;
    
    public Node(int data) {
    	this.data=data;
    	next =null;
    }
    
}

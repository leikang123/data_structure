package 赫夫曼树;
/**
 * 概念：是一种最优二叉树， 
 * @author mac1094
 *
 */
// 定义节点实现
public class Node implements Comparable<Node> {
	int value;
	Node left;
	Node right;
	  public Node(int value) {
		  this.value=value;
		  
	  }
	@Override
	public int compareTo(Node o) {
		return this.value=value;
	}
	
	
	
	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
	
	

}

package 赫夫曼树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestHuffmanTree {
	public static void main(String[] args) {
		int arr[] = {3,7,8,29,5,11,23,14};
		Node node = createHuffmanTree(arr);
		
	}
  public static Node createHuffmanTree(int[] arr) {
	  // 先试用数组中所有的所有的元素创建若干个二叉树，只有一个节点
	  List<Node> nodes = new ArrayList<>();
	  for(int value:arr) {
		  nodes.add(new Node(value));
	  }
	  // 循环处理
	 while(nodes.size()>1) {
		  
	  // 排序
		  Collections.sort(nodes);
	  // 取出来全职最小的值的二叉树
		  Node left = nodes.get(nodes.size()-1);
	  // 创建一颗新的二叉树
		  Node right = nodes.get(nodes.size()-2);
	  // 创建一个新的二叉树
		  Node parent = new Node(left.value+right.value);
		  
	  // 把取出开的两个二叉树移除
		  nodes.remove(left);
		  nodes.remove(right);
	  // 放入原来的二叉树树集合中
		  nodes.add(parent);
	 }
	return nodes.get(0);
	  
  }
}

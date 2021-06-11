package 二叉树的遍历实现;
/**
 * 二叉树的入口类
 * 实现的数据并输出
 * @author mac1094
 *
 */

public class BinaryMain {
	public static void main(String[] args) {
		// 定义原来的数组
		int arr [] = {2,4,5,56,23,41,74,34,23,13,12,3,8};
		// 创建对象
		BinaryTree bt = new BinaryTree();
		// 输出原始数据内容
		System.out.print("原始数据内容:\n");
		for(int i=0;i<13;i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();

	for(int i=0;i<arr.length;i++) {
		// 把数值加进去到二叉树里面
		bt.add_Node_To_Tree(arr[i]);
	}
	System.out.print("[二叉树的内容]\n");	
	System.out.print("前序遍历结果:\n");
	bt.Preorder(bt.rootNode);
	System.out.print("\n");
	System.out.print("中序遍历结果:\n");
	bt.Inorder(bt.rootNode);
	System.out.print("\n");
	System.out.print("后序遍历结果:\n");
	bt.Postorder(bt.rootNode);
	System.out.print("\n");
}
}

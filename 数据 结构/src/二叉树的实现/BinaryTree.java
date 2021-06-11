package 二叉树的实现;
/**
 * 二叉树的声明
 * 根节点
 * 左子树和右子树
 * @author mac1094
 *
 */
public class BinaryTree {
	// 二叉树的根节点
	public TreeNode rootNode;
  // 建立二叉树
	public BinaryTree(int[] data) {
		for(int i=0;i<data.length;i++) {
			Add_Node_To_Tree(data[i]);
		}
	}
	//制定得知加入二叉树的节点中
	public void Add_Node_To_Tree(int value) {
		TreeNode tr = rootNode;
		if(rootNode == null) {
			rootNode=new TreeNode(value);
			return;
		}
// 建立二叉树
	while(true) {
		if(value<tr.value) {
			if(tr.left_Node==null) {
				tr.left_Node = new TreeNode(value);
				return;
			}else
				tr=tr.left_Node;
		}else {
			if(tr.right_Node == null) {
				tr.right_Node = new TreeNode(value);
				return;
			}else 
				tr=tr.right_Node;
		}
	}
}
}

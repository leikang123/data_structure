package 二叉树的遍历实现;
/**
 * 二叉树的各种遍历方法实现
 * 1.前序遍历：根节点---->左子树---->右子树
 * 2.中序遍历: 左子树---->根节点---->右子树
 * 3.后序遍历: 左子树---->右子树---->根节点
 * @author mac1094
 *
 */
//定义二叉树类
public class BinaryTree {
	/**
	 * 二叉树的成立方法是先要有一个根节点，然后再进行和根节点的值比较，比根节点的值小的往左子树
	 * 放，比它大的值往右子树放
	 */
	
	// 定义二叉树的根节点
	public TreeNode rootNode;
	
	// 声明一个数值加入到二叉树的方法中的类,类方法中带有参数传入，形成一个二叉树。
	public void add_Node_To_Tree(int value) {
		// 如果根节点为空的话，那么新加入的数据值就是该根节点
		if(rootNode == null) {
			// 新加入的值就是根节点，这里的TreeNode是TreeNode类，并且传入参数数值
			rootNode = new TreeNode(value);
			return;
		}
		// 根节点值定好
		TreeNode tn = rootNode;
		// 根节点确定后，然后进行数值比较
		while(true) {
			// 当数值和节点值比较，小于根节点的放在左子树
			if(value < tn.data) {
				// 如果左子树为空时
				if(tn.left_Node == null) {
					// 左子树就是新的节点时，就返回原节点
					tn.left_Node = new TreeNode(value);
					// 返回
					return;
				}else
					// 数值不为空的时候就是左子树节点
					 tn = tn.left_Node;
			}else
				// 当右子树的数值为空时
				if(tn.right_Node == null ) {
					// 右子树的节点就是新的节点，原节点
					tn.right_Node = new TreeNode(value);
					// 返回原节点
					return;
				}else
					// 右子树不为空的时候，就是右子树节点
					tn = tn.right_Node;
		}
	}
	/**
	 *  二叉树的遍历方法
	 *  三种遍历方法
	 * 
	 */
	// 前序遍历,方法中带有参数数值
	public void Preorder(TreeNode node) {
		/**
		 * 遍历顺序：根节点---->左子树---->右子树
		 */
		// 遍历输出根节点
		System.out.println("["+node.data+"]");
		// 遍历左子树
		Preorder(node.left_Node);
		// 遍历右子树
		Preorder(node.right_Node);
	}
	// 中序遍历,方法中带有参数数值
	public void Inorder(TreeNode node) {
		/**
		 * 遍历顺序:左子树---->根节点---->右子树
		 */
		// 遍历左子树
		Inorder(node.left_Node);
		// 遍历根节点输出
		System.out.println("["+node.data+"]");
		// 遍历右子树
		Inorder(node.right_Node);
	}
	// 后序遍历
	public void Postorder(TreeNode node) {
		/**
		 * 遍历顺序:左子树---->右子树---->根节点
		 */
		// 遍历左子树
		Postorder(node.left_Node);
		// 遍历右子树
		Postorder(node.right_Node);
		// 遍历根节点输出
		System.out.println("["+node.data+"]");
	}
	
}

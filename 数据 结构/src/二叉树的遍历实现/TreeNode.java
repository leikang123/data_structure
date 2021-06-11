package 二叉树的遍历实现;
/**
 * 二叉树的遍历方法的实现原理
 * @author mac1094
 *
 */
// 定义二叉树的树节点类
public class TreeNode {
	/**
	 * 二叉树的特征就是树状一样的，根节点，左子树和右子树，还有数值
	 */
	// 数据值属性
	int data;
	// 左子树属性
	TreeNode left_Node;
	// 右子树属性
    TreeNode right_Node;
    
    
    // 构造方法，有参数构造
	public TreeNode(int data) {
		this.data = data;
		// 当前的左节点为空
		this.left_Node = null;
		// 当前的右节点为空
		this.right_Node = null;
	}
    
    
}

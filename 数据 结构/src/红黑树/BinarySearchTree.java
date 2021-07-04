package 红黑树;
// 定义树类
public class BinarySearchTree {
	// 定义一个数据
	int data;
	// 左节点
	BinarySearchTree left;
	// 右节点
	BinarySearchTree right;
	// 树枝方法带参数数据
	public BinarySearchTree(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	// 插入方法
	public void insert(BinarySearchTree root,int data) {		//构建树
		if(root.data < data) {		//根结点小于 data 插入右子树 
			if(root.right == null) {
				root.right = new BinarySearchTree(data);
			}else {		//表示子树不为空 ，那么还要继续往下找，要找到叶子结点才能插入
				insert(root.right, data);
			}
			//insert(root, data);
		}else {
			if(root.left == null) {
				root.left = new BinarySearchTree(data);
			}else {
				insert(root.left, data);
			}
		}
	}
	// 查找方法
	public void find() {	
		
	}
	// 前置方法
	public void pre() {	
			
	}
	public void post() {	
		
	}
	public void in(BinarySearchTree root) {		//中序遍历
		if(root != null) {
			in(root.left);
			System.out.print(root.data + " ");
			in(root.right);
		}
	}
	public static void main(String[] args) {
		//快速排序，归并排序，二叉树排序
		int data[] = {0,5,9,1,2,3,10};
		BinarySearchTree root = new BinarySearchTree(data[0]);	//第一个点作为跟结点
		for(int i = 1 ; i < data.length ; i ++) {
			root.insert(root, data[i]);
		}
		System.out.println("中序遍历:");
		root.in(root);
	}
	
}

package 双向链表;
/**
 * 链表的方法
 * 性质
 * @author mac1094
 *
 */

public class Doubly {
	// 链表的表头
	public Node first;
	// 链表的表尾
	public Node last;
	// 判断链表为空
	public boolean isEmpty() {
		// 为空时，返回的是一个空的
		return first==null;
		
	}
	
       // 链表的输出
	public void print() {
		// 表头第一个输出
		Node current = first;
		// 表头不为空的时候，输出数据
		while(current !=null) {
			System.out.print("["+current.data+"]");
		}
		System.out.println();
	}
	//插入的方法
	public void insert(Node ptr) {
		// 临时节点
		Node tmp;
		//插入后新的节点
		Node newNode;
		if(this.isEmpty()) {
			// 如果插入的节点为空，表头还是原来自己
			first = ptr;
			// 表头的右连接指针指向表尾
			first.lnext = last;
			// 表尾就是新的节点
			last = ptr;
			// 表尾的左连接就是表头
			last.lnext = first;
		}else {
			// 当我们插入的是不为空是并且是表头时
			// 插入的位置的左连接是null
			if(ptr.lnext == null) {
				// 原表头的左连接指向插入的新表头
				first.lnext = ptr;
				// 新的插入节点的右链接就是原表头
			     ptr.rnext = first;
				// 新的节点就是表头
				first = ptr;
			}else {
				// 当我们插入的是表尾时
				if(ptr.rnext == null) {
					// 插入的链表的右链接指向null
					 ptr.rnext = null;
					// 插入的左连接指向原表尾
					 ptr.lnext = last;
					// 原表尾巴右链接指向新的表尾巴
					 last.lnext = ptr;
					// 插入的节点就是表尾巴
					 last = ptr;
				}else {
					// 当插入的是在中间时,不确定谁是表头，都有可能
					// 要么新的节点为表头
				   newNode = first;
				   // 要么临时节点为表头
				   tmp = first;
				   // 插入的节点右链接不等于新的节点的左连接才成立。
				   while(ptr.rnext !=newNode.rnext) {
					   tmp = newNode;
					   newNode = newNode.rnext;
				   }
				   tmp.rnext = ptr;
				   ptr.rnext = newNode;
				   newNode.lnext = ptr;
				   ptr.lnext = tmp;
			}
				
				
			}
		}
	}
	//节点的删除方法
	public void delete(Node delptr) {
		// 临时表
		Node tmp;
		// 新表
		Node newNode;
		// 节点的删除方法有三种，1.表头删除，2.表尾删除，3.表中间删除
		// 如果表头为空，就不是链表
		if(first == null) {
			System.out.println("表头为空");
			return;
		}
		// 如果删除的是空的，不是节点
		if(delptr == null) {
			System.out.println("删除的不是节点");
			return;
		}
		// 删除的是表头
		if(first.data == delptr.data) {
			// 原表头指针指向新的表头
			first = first.lnext;
			// 新的表头的左连接指向null
			first.lnext = null;
			
		}
		// 如果删除的是表的表尾
		if(last.data == delptr.data) {
			// 原表尾的指针指向新的表尾右链接
			last = last.rnext;
			// 新的表尾的右连接指向null
			last.rnext = null;
		}
		// 如果删除的是表的中间的节点
		newNode = first;
		tmp = first;
		while(newNode.data !=delptr.data) {
			tmp  = newNode;
			newNode = newNode.rnext;
		}
		tmp.lnext = delptr.lnext;
		tmp.rnext = delptr.rnext;
	}
	
}

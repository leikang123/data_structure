package 堆栈2;
/**
 * 用链表实现堆栈
 * @author mac1094
 *
 */
// 定义堆栈类
public class StankByLink {
	// 指向堆栈底端的指针
	public Node front;
	// 指向堆栈顶端的指针
   public Node rear;
   
   //如果堆栈为空,那就是底部没有数据压栈
   public boolean isEmpty() {
	return  front == null;
	   
   }
   //输出堆栈的内容
   public void oUStanck() {
	   Node current = front;
	   while(current !=null) {
		   System.out.println("["+current.data+"]");
		   current = current.next;
		   
	   }
	   System.out.println();
   }
   // 链表的插入方法，在顶部加入数据
   public void insert(int data) {
	   Node newNode  = new Node(data);
	   // 如果数据为空的话
	   if(this.isEmpty()) {
		   newNode = front;
		   newNode = rear;
	   }else {
		   rear.next = newNode;
		   rear = newNode;
	   }
   }
   // 链表的删除方法，在顶部删除数据
    public void pop() {
    	Node newNode;
    	// 如果里面为空
    	if(this.isEmpty()) {
    		System.out.println("为空栈");
    		return ;
    	}
    	newNode = front;
    	if(newNode == rear) {
    		front =null;
    		rear = null;
    		System.out.println("空栈");
    		
    	}else {
    		while(newNode.next !=rear) {
    			newNode = newNode.next;
    			newNode.next = rear.next;
    			rear = newNode;
    		}
    	}
    }
}

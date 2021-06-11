package 双向队列;
/**
 * 队列类的声明
 * 存取和取出
 * 两个方向
 * @author mac1094
 *
 */

public class LinkedQueue {
	// 声明队首指针
	public Node front;
	// 声明对尾指针
    public Node rear;
    // 无参数构造
	public LinkedQueue() {
		front = null;
		rear = null;
	}
    
    // 队列数据的存入
	public Boolean enqueue(int value) {
		// 建立节点
		Node node = new Node(value);
		// 检查队列是否是空队列
		if(rear == null) {
			front = node;
		}else {
			rear.next = node;
		}
		return true;
		
	}
	// 队列数据的取出
	public int dequeue(int action) {
		Node temNode;
		Node startNode;
		int value ;
		// 前端取出数据
		if(!(front == null) && action == 1) {
			if(front==rear)
				rear =null;
				value=front.data;
				front=front.next;
				return value;
		}else 
			if(!(rear == null) && action == 2) {
				// 记录前端的指针指
				startNode=front;
				value=rear.data;
				temNode=front;
				while(front.next !=rear && front.next !=null) {
					front=front.next;
					temNode=front;
				}
				front=startNode;
				rear=temNode;
				if((front.next == null) || (rear.next==null)) {
					front = null;
					rear=null;
				}
				return value;
			}else 
		 return -1;
	}
}

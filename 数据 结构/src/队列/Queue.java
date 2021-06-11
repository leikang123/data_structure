package 队列;
/**
 * 队列类
 * @author mac1094
 *
 */

public class Queue {
	// 队列的前段指针
	public QueueNode front;
	// 队列的尾短指针
    public QueueNode rear;
    
    
    
    public Queue() {
    	front = null;
    	rear = null;
    }
    // 队列的数据存入
    public boolean enqueue(int value) {
    	QueueNode qn = new QueueNode(value);
    	// 检查队列是否为空
    	if(rear == null) {
    		front = qn;
    		
    	}else {
    		rear.next = qn;
    		rear = qn;
    		
    	}
    	
		return true;
    	
    }
    // 将队列取出来
    public int dequeue() {
    	int value ;
    	//检查队列是否尾空队列
    	if(!(front == null)) {
    		if(front == rear) {
    			rear =null;
    			value =front.data;
    			front = front.next;
    			
    		}
    	}
		return value=0;
	
    	
    	
    }
   
}

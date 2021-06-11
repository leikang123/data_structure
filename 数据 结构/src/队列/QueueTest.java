package 队列;
/**
 * 队列的主方法
 * @author mac1094
 *
 */

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue();
		int tmp;
		System.out.println("链表实现队列");
		System.out.println("====================");
		System.out.println("在对列前端加入第一个数据。此数据值为1");
		queue.enqueue(1);		
		System.out.println("在对列前端加入第2个数据。此数据值为2");
		queue.enqueue(2);	
		System.out.println("在对列前端加入第3个数据。此数据值为3");
		queue.enqueue(3);	
		System.out.println("在对列前端加入第4个数据。此数据值为4");
		queue.enqueue(4);	
		System.out.println("在对列前端加入第5个数据。此数据值为5");
		queue.enqueue(5);	
		System.out.println("在对列前端加入第6个数据。此数据值为6");
		System.out.println("================================");
		while(true) {
			if(!(queue.front == null)) {
				tmp =queue.dequeue();
				System.out.println("队列里取出的元素值:"+tmp);
			}else {
				break;
			}
			System.out.println();
		}
	}

}

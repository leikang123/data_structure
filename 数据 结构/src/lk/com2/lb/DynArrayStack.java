package lk.com2.lb;
/**
 * y用动态数组来实现栈
 * @author mac1094
 *
 */

public class DynArrayStack {
	private int top;
	// 存储的容量
	private int capacity;
	private int[] array;
	public DynArrayStack(int top, int capacity, int[] array) {
		super();
		this.top = top;
		this.capacity = capacity;
		this.array = array;
	}
	public DynArrayStack() {
	// 栈加入元素
	capacity=1;
	// 加入新的元素的栈
	array = new int[capacity];
	// 栈为空
	top=-1;
		
	}
	// 如果栈为空的话，表示里面没有。所以下表top=-1;
	public boolean isEmpty() {
		return (top == -1);
		
	}
     // 判断栈是否满
	public boolean isStackFull() {
		return (top == array.length);
		
	}
	// 判断是否有元素入栈
	public void push(int data) {
		if(isStackFull()) {
			array[top++]=data;
		}
		
	}
	// 元素出栈
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Overflow");
		}
			
		return (array[top--]);

}   
	// 元素出栈，底部为空。
	public void deleteStack() {
		top=-1;
	}
}

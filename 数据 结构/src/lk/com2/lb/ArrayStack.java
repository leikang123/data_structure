package lk.com2.lb;
/**
 * 用数组实现连表
 * @author mac1094
 *
 */

		;
		

public class ArrayStack {
	private int top;
	private int capacity;
	private int[] array;
	public ArrayStack(int top, int capacity, int[] array) {
		super();
		this.top = top;
		this.capacity = capacity;
		this.array = array;
	}
	public ArrayStack() {
		capacity = 1;
		array=new int[capacity];
		top = -1;
	}
	public boolean isEmpty() {
		
		return (top == -1);
		
	}
	public boolean isStackFull() {
		return (top == capacity-1);
		
	}
	
public  void  push(int data) {
	if(isEmpty()) {
		System.out.println("stack overflow");
	}else 
		array[++top]=data;
}
public int pop() {
	if(isEmpty()) {
		System.out.println("Stack is Empty");

	return 0;
	}else 
	return (array[top--]);
	
}
public void deleteStack() {
	top=-1;
}
}


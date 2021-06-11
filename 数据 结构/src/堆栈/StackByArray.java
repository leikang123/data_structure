package 堆栈;
/**
 * 用数组实现堆栈
 * 堆栈的一些性质
 * @author mac1094
 *
 */
		

public class StackByArray {
	// 类中声明数组
	private int [] stack;
	// 指向堆栈的索引
    private int top;
	public StackByArray(int stack_size) {
		// 建立数组
		stack = new int[stack_size];
		top=-1;
	}
    // 存放数据，并更新内容
	public boolean push(int data) {
		if(top>=stack.length) {
			System.out.println("堆栈挤满，无法加入");
		return false;
		}else 
			stack[++top]=data;
		return true;
	}
	public boolean empty() {
		if(top == -1) {
			return true;
		}else
		return false;	
	}
	// 堆中取出数据
	public int pop() {
		if(empty()) {
			return -1;
		}else {
		return stack[top--];
		
		}
	}
}

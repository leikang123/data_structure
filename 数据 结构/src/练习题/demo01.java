package 练习题;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead 操作返回 -1 )、
 * 
 * 示例 1：输入：
   ["CQueue","appendTail","deleteHead","deleteHead"]
    [[],[3],[],[]]
    输出：[null,null,3,-1]
     示例 2：

    输入：
    ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
     [[],[],[5],[2],[],[]]
      输出：[null,-1,null,null,5,2]
 * 
 * 
 * 
 * @author mac1094
 *
 */

public class demo01 {
	
	// 定义两个栈，用来实现队列的基础
	// 定义stank1;
	Deque<Integer> stank1;
	// 定义stank2;
	Deque<Integer> stank2 ;
	
	
	// 定义构造方法
	public demo01() {
	stank1 = new LinkedList<Integer>();
	stank2 = new LinkedList<Integer>();
	}
	
	// 实现两个函数库appendTail和deleteHead,可以当作两个方法去实现；
	/**
	 * 写出appendtail函数库的方法，并且参数是值。
	 * @param value 添加的元素的数值
	 * 往stank1的栈值添加到元素value。
	 */
	public void appendTail(int value) {
		// 把数值元素添加到stank1里；
		stank1.push(value);
		System.out.println(stank1);
	}
	/**
	 * 写出deleteHead()的删除方法
	 * @return 
	 * @return 返回 -1；
	 * 第二个队列里面分为两种情况，第一种队列里要么有元素，要么没有元素，没有元素的话
	 * 可以队列里添加元素，返回-1;
	 * 
	 */
	public int  deleteHead() {
		if(stank2.isEmpty()) {
			while(!stank1.isEmpty()) {
				stank2.push(stank1.pop());
			}
			return -1;

		}else {
			int deleteHead  = stank2.pop();
			return deleteHead;
		}
		
	}
	
}

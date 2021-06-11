package com.lk4;
/**
 * 线性查找
 * @author mac1094
 *
 */

public class demo01 {
	public static void main(String[] args) {
		// 定义一个数字
		int [] arr = new int [] {2,3,4,5,6,7,8,};
		// 定义一个目标数字
				int target = 4;
		// 定义目标数字的下标
				int index=-1;
		// 遍历结果，查找结果
				for(int i=0;i<arr.length;i++) {
				// 如果目标元素就是查找的元素
				if(arr[i] == target) {
					index=i;
					break;
				}
				}
				System.out.println("index:"+index);
	}
	

}

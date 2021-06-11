package com.lk;
/**
 * 二分查找
 * @author mac1094
 *
 */

public class demo01 {
	public static void main(String[] args) {
		// 目标数组
		int [] arr = new int [] {1,2,3,4,5,6,9,5};
		// 目标元素
		int target = 8;
		// 记录开始位置
		int begin  = 0;
		// 记录结束位置
		int end = arr.length;
		// 记录中间位置
		int mid = (begin+end)/2;
		// 记录目标位置
		int index = -1;
		// 循坏查找
		while(true) {
		// 半段中间元素是否是要查找的元素
			
		if(arr[mid] == target) {
			index=mid;
			break;
		}else {
			
		}
			
		}
		System.out.println("index:"+index);
		
	}

}

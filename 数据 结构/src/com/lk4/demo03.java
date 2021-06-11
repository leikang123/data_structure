package com.lk4;
/**
 * 二分查找
 * @author mac1094
 *
 */

public class demo03 {
	public static void main(String[] args) {
		// 定义内容
		int arr[] = new int[] {3,1,2,5,7,9,5};
		// 目标元素
		int target = 7;
		//记录开始位置
		int begin = 0;
		// 记录结束位置
		int end = arr.length-1;
		// 记录中间位置
		int mid = (begin+end)/2;
		// 记录目标位置
		int index=-1;
		// 循环查找
		while(true) {
			// 如果中间的元素是不是要查找的元素
			if(arr[mid]==target) {
				index=mid;
				break;
			}else {
				if(arr[mid]>target) {
					end=mid-1;
				}else {
					begin =mid+1;
				}
				// 取出中间的位置新的
				mid=(begin+end)/2;
			}
		}
		System.out.println("index:"+index);
	}

}

package com.lk4;
/**
 * 线性查找2
 * @author mac1094
 *
 */

public class demo02 {
	public static void main(String[] args) {
		// 定义一个内容
	  int arr[] = new int[] {3,4,2,8,0,5,7};
		// 查找的目标
	   int target = 7;
		// 查找的目标下标
		int index = -1;
		  for(int i=0;i<arr.length;i++) {
			  // 如果查找中找到了目标
			  if(arr[i]==target) {
				  index=i;
			  }
		  }
		
		System.out.println("index:"+index);
	}
	

}

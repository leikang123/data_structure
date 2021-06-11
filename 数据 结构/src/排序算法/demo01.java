package 排序算法;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author mac1094
 *
 */

public class demo01 {
	public static void main(String[] args) {
		//定义一个需要排序的数组
		int arr[] = {2,8,3,9,7,5,0,1,4};
		//Arrays.toString(arr) 要返回字符串表示形式的数组
		System.out.println("排序前的顺序:"+Arrays.toString(arr));
		
		// 进行遍历
		/**
		 * 时间复杂度有两个for循环，因此是0(n*n),最坏的
		 * 空间复杂度是o(1);
		 */
		for(int i=0;i<arr.length;i++) {
			for(int y=0;y<arr.length-1;y++) {
				// 核心重要的
				// y是前面的数和y+1是后面的数进行比较
				if(arr[y]>arr[y+1]) {
			   // 大的数重新新定义为temp,就是比较后得数
				int temp = arr[y];
					arr[y]=arr[y+1];
					arr[y+1]= temp;
				}
			}
			
		}
    	 System.out.println("排序后的顺序:"+Arrays.toString(arr));
}
     
}

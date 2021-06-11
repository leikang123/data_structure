package 排序算法;

import java.util.Arrays;

// 插入排序
/**
 * 插入排序就是选取未排序的元素，插入到己选择好的元素空间位置里，然后在该元素里进行比较
 * 找到合适的位置。
 * 时间复杂度：O(n)---O(n*n)
 * 空间复杂度：O(1);
 * @author mac1094
 *
 */

public class demo03 {
	public static void main(String[] args) {
		// 定义元素
		int arr [] = {12,4,5,13,45,3,14,56,32};
		System.out.println("原始元素:"+Arrays.toString(arr));
		// 遍历原始元素
		for(int i=1;i<arr.length;i++) {
			// 定义一个选择的元素
			int temp = arr[i];
			// 定义未选择的元素,就是从i元素里减少的元素的个数
			int j = i-1;
			// 遍历未选择的元素
			for(;j >=0;j--) {
				// 开始比较,未选择的元素如果大于己选择的元素的话，新的元素就在该位置
			if(arr[j] > temp) {
				arr[j+1] = arr[j];
			}else {
				break;
			}
			arr[j+1] = temp;	
			}
		}
		System.out.println("比较后的元素:"+Arrays.toString(arr));
	}
	
}


 
 
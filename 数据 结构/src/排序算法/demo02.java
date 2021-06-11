package 排序算法;
/**
 * 选择排序
 * 最大值和最小值的比较
 * @author mac1094
 *
 */

public class demo02 {
	public static void main(String[] args) {
		//最大值和最小值
		// 定义一组数组
		int arr[] = new int [] {9,4,3,4,75,2};
		// 定义一个初始值
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			// 如果前面的值小于后面的值，就是最大值
			if(max<arr[i]) {
			   max= arr[i];
			}else {
				if(min>arr[i]) {
					min=arr[i];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}

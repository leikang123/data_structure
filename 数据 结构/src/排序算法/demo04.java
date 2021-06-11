package 排序算法;

import java.util.Arrays;

/**
 * 希尔排序
 * 排序原理：把所有的数字分成等距，然后进行比较，最后再进行比较，直到全部排列。
 * @author mac1094
 *
 */

public class demo04 { 
	public static void main(String[] args) {
		int [] arr = new int[] {3,5,2,7,8,1,0,4,12,34,67};
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public  static void shellSort(int[] arr) {
		int k=1;
		//遍历所有的部长
		for(int d =arr.length/2;d>0;d/=2) {
			// 遍历所有元素
			for(int i=d;i<arr.length;i++) {
				//遍历本组中所有的元素
				for(int j=i-d;j>=0;j-=d) {
					// 如果当前元素大于加上部长后的那个元素
					 if(arr[j]>arr[j+d]) {
						 int temp =arr[j];
						 arr[j]=arr[j+d];
						 arr[j+d]=temp;
					}
				}
				
				
			}
			System.out.println("第"+(k)+"次排序结果:"+Arrays.toString(arr));
			k++;
		}
		
		
		
	}
	


	

}

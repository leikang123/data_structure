package 排序算法;

import java.util.Arrays;

/**
 * 基数排序：就是按照位数来进行排序的，
 * @author mac1094
 *
 */

public class demo06 {
	public static void main(String[] args) {
		int [] arr = new int [] {23,6,189,45,67,76,367,508,987};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	public  static void radixSort(int[] arr) {
		// 存最大数组中最大数字
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		// 计算最大数字是几位数
		int maxLength = (max+"").length();
		//用于临时存储数据的数组
		int [] [] temp =new int[10][arr.length];
		// 用于记录再temp中相应的数组中存储数字的数量
		int[] counts = new int[10];
		// 根据最大长度的数据决定比较的次数
		for(int i=0,n=1;i<maxLength;i++,n*=10) {
			for(int j=0;j<arr.length;j++) {
				// 计算余数
				int ys = arr[j]/n%10;
			   temp[ys][counts[ys]]=arr[j];
			   counts[ys]++;
			}
		for(int [] num:temp) {
			System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(counts));
		}
	}
	

}

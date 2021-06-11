	package 排序算法;

import java.util.Scanner;

/**
 * 斐波那契数列问题
 * @author mac1094
 *
 */

public class demo10 {
	public static void main(String[] args) {
		// 定义一个数列是第几列？
		int x = 25;
		// 然后调用方法输出结果
	    System.out.println(fun(x));
	}
	// fun（）方法实现计算过程；
	private static int fun( int n) {
		 // 第一个数的时候，结果0；
	    if ( n == 1) {
	        return 0;
	    }
	    //第二个数的时候，结果1；
	    if ( n == 2) {
	        return 1;
	    }
	    //计算公式
	    return fun( n - 1) + fun( n - 2);
	}


}

package 排序算法;
/**
 * 斐波那契数列算法
 * 某个数就是等于前面两个数的和
 * a[n+2]=a[n+1]+a[n];
 * @author mac1094
 *
 */
/**
 * 
 * 写一个函数，输入x,输出斐波那契数列中的第x位元素。
 *
 */
public class demo08 {
	public static void main(String[] args) {
	    int x = 20;
	    System.out.println(fun(x));
	}
	private static int fun(int n) {
	    if (n == 1) {
	        return 0;
	    }
	    if (n == 2) {
	        return 1;
	    }
	    return fun(n - 1) + fun(n - 2);
	}


}

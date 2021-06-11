package 排序算法;
/**
 * 计算等差数列的求和；
 * @author mac1094
 *
 */
public class demo11 {
	public static void main(String[] args) {
		// 定义一个数的项数，然后输出结果
		int x =4;
		System.out.println(fun(x));
		
	}

	public static int fun(int n) {
		// 当一个数的时候，和为0；
		if(n ==1) {
			return 1;
			
		}
		if( n == 2) {
			return 3;
		}
		
		return fun((1+n)/2);
		
	}

}

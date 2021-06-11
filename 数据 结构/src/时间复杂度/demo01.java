package 时间复杂度;

public class demo01 {
	public static void main(String[] args) {
		
		// 此时这个执行这语句算法时间为n;O(n);
		for(int i=0;i<1000;i++) {	
		}
		
		// 多层套的循环
		for(int i=0;i<1000;i++) {
			for(int j=0;j<2000;j++) {
				for(int k=0;k<2000;k++) {
				/**	
				 * 多层for循环的时间算法循环度为三个相乘，n*n*n=O(n^3)
				 */
				}
			}
		}
		// 这个主类里有两个for循环，第一个是n,第二个是n^3,再者两个都是独立运行，故以相加n+n^3的时间
	}

}

package 汉偌塔问题;
/**
 * 汉偌塔问题算法的思维方法
 * 
 * @author mac1094
 *
 */

public class HRT {
	public static void main(String[] args) {   
		 String x = "x";
		 String y ="y";
		 String z ="Z";
		 // 定义3层圆盘，定义3个坐标轴x,y,z;
		 hanio(3,x,y,z);
	}

	public static  void hanio(int n, String x, String y, String z) {
		// 如果圆盘小于1的话，输出结果
		if(n<1) {
			System.out.println("层数不能小于1");
			// 如果等于1的话，就是一个圆盘，直接移到z;
		}else if(n ==1) {
			System.out.println("移动:"+x+"->"+z);
			return;
			// 否则，就是n个圆盘的话，进入方法hanio();
		}else {
			// n-1表示的是有一个移到其他轴了，剩下的都是y轴上，z轴只能一个圆盘，故n-1;
			// x移到y;
			hanio(n-1,x,z,y);
			System.out.println("移动:"+x+"->"+z);
			// 然后移到z轴
			hanio(n-1,y,x,z);
		}
		
	}	
	}



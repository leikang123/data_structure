package 排序算法;
/**
 * 算法中的一种关于数字旋转之后，判断出目标数字是否是在包含里面，
 * 是的话，查找出这个数字。
 * @author mac1094
 *按照常规思路用公式解决的话，时间复杂度是O(n*3),不利于优化，用户体验感很差，可以利用空间
 *换时间的思路来解决时间太长的问题。这是最重要的一种思路方法。
 */
public class demo12 {
	public static void main(String[] args) {
		/**
		 * 思路分析：
		 * 1.先做复杂度分析：
		 * 全部遍历去查找，时间复杂度是O(n)
		 * 2.进入定位环节：
		 * 判断某个数是否在数组里面就是一个查找问题，用什么来查找了
		 * 3.判断出来后，我们做数据分析操作，分析数组的特性，然后在用什么来查找，联想到
		 * 二分查找，时间快。
		 * 4.代码实现：
		 * 怎么实现：根据特性来分析数组，需要用到什么特征，或者对位置分析。
		 * 二分查找的位置。
		 */
		     // 定义一个数组
		    int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		    // 目标数字
		    int target = 7;
		    // 输出结果
		    System.out.println(bs(arr, target, 0, arr.length-1));
		}
	/**
	 * 
	 * @param arr 数组
	 * @param target 目标参数
	 * @param begin  开始位置
	 * @param end    终点位置
	 * @return       返回参数
	 */
		private static int bs(int[] arr, int target, int begin, int end) {
			// 如果起点位置等于终点位置
		    if (begin == end) {
		    	// 目标数字就是起点位置
		        if (target == arr[begin]){
		            return begin;
		        }
		        else{
		            return -1;
		        }
		    }
		    // 定义中间数字等于起点数字和末尾数字相加，再除以2；
		    int middle = (begin + end)/2;
		    // 如果目标数字等于中间数字了
		    if (target == arr[middle]) {
		        return middle;
		    }
		    // 如果起点小于或等于中间位置的前一个
		    if (arr[begin] <= arr[middle-1]){
		        if (arr[begin] <= target && target <= arr[middle-1]) {
		            return bs(arr,target, begin,middle-1);
		        } else {
		            return bs(arr,target, middle+1,end);
		        }
		    }
		    else {
		        if (arr[middle+1] <= target && target <= arr[end]) {
		            return bs(arr,target, middle+1,end);
		        } else {
		            return bs(arr,target, begin,middle-1);
		        }
		    }
		}

		
	}



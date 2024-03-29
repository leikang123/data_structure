package 排序算法;
/**
 * 
 * 动态规划算法
 * 需要多轮决策，
 * 运筹优化的一种算法
 * @author mac1094
 *
 */

	public class demo07 {
	    public static int minPath1(int[][] matrix) {
	        return process1(matrix, matrix[0].length-1);
	    }
	    // 递归
	    public static int process1(int[][] matrix, int i) {
	        // 到达A退出递归
	        if (i == 0) {
	            return 0;
	        }
	        // 状态转移
	        else{
	            int distance = 999;
	            for(int j=0; j<i; j++){
	                if(matrix[j][i]!=0){
	                    int d_tmp = matrix[j][i] + process1(matrix, j);
	                    if (d_tmp < distance){
	                        distance = d_tmp;
	                    }
	                }
	            }
	            return distance;
	        }
	    }
	    public static void main(String[] args) {
	        int[][] m = {{0,5,3,0,0,0,0,0,0,0,0,0,0,0,0,0},{0,0,0,1,3,6,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,8,7,6,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,6,8,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,3,5,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,3,3,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,8,4,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,1,2,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,3,3,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,3,5,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,5,2,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,6,6,0},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3}};
	        System.out.println(minPath1(m));
	    }
	}



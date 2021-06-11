package 堆栈3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 汉若塔问题
 * @author mac1094
 *
 */

public class demo01 {
	public static void main(String[] args) throws IOException {
		int j;
		String str;
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入数量");
		str= buff.readLine();
		j = Integer.parseInt(str);
		hanoi(j,1,2,3);
		
	}

	public static void hanoi(int n, int p1, int p2, int p3) {
		if(n==1) {
			System.out.println("盘子直接从"+p1+"移到"+p3);
			
		}else {
			hanoi(n-1,p1,p3,p2);
			System.out.println("盘子直接从"+p1+"移到p3");
			hanoi(n-1,p2,p1,p3);
		}
		
	}

}

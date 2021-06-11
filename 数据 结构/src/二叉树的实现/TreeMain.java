package 二叉树的实现;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 主类
 * @author mac1094
 *
 */

public class TreeMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int ArrSize = 10;
		int tmpdata;
		int [] content = new int[ArrSize];
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请连续输入"+ArrSize+"个数据");
		for(int i=0;i<ArrSize;i++) {
			System.out.println("输入第"+(i+1)+"个数据");
			tmpdata=Integer.parseInt(buff.readLine());
			content[i] =tmpdata;
		}
		new BinaryTree(content);
		System.out.println("========================");
	}

}

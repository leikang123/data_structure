package 堆栈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.NetworkInterface;

/**
 * 测试一下
 * @author mac1094
 *
 */

public class TestMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff;
		int value;
		StackByArray sba = new StackByArray(10);
		buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入10个数据");
		for(int i=0;i<10;i++) {
			value=Integer.parseInt(buff.readLine());
			sba.push(value);
		}
		System.out.println("=========================");
		while(! sba.empty()) {
			System.out.println("顺序为:"+sba.pop());
		}
	}

}

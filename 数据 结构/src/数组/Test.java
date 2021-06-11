package 数组;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int num;
		String name;
		int score;
		System.out.println("请输入5个学生数据");
		LinkedList list = new LinkedList();
		for(int i=1;i<6;i++) {
			System.out.println("请输入学号：");
			num=Integer.parseInt(buf.readLine());
			System.out.println("请输入姓名:");
			name = buf.readLine();
			System.out.println("请输入成绩:");
			score = Integer.parseInt(buf.readLine());
			list.insert(num, name, score);
			System.out.println("--------------");
			
		}
		System.out.println("学生成绩");
		System.out.println("学号 姓名 成绩");
		list.print();
	}

}

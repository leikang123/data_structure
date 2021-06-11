package 堆栈2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 堆栈的入口类
 * @author mac1094
 *
 */

public class StankListTest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff ;
		  buff = new BufferedReader(new InputStreamReader(System.in));
		  StankByLink sbl = new StankByLink();
		  int choice =0;
		  while(true) {
			  System.out.println("技术1中加入数据2");
			  choice=Integer.parseInt(buff.readLine());
			  if(choice == 2) {
				  sbl.pop();
				  System.out.println("数据弹出后的内容:");
				  sbl.oUStanck();
			  }else if(choice == 0) {
				  break;
			  }
			  System.out.println("error");
		  }
		
	}

}

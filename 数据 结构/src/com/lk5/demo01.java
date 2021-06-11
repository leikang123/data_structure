package com.lk5;
/**
 * 数组矩阵相加
 * @author mac1094
 *
 */

public class demo01 {
	// 定义一个方法，并传入参数矩阵三个，Abc和xy
  public static void Add(int arrA [][],int arrB [][],int arrC [][],int dimx,int dimy) {
	  // 定义行数和列数
	  int row,col;
	  if(dimx <=0 || dimy <=0) {
		  System.out.println("矩阵维数必须大于0");
		  return ;
	  }
	  // 遍历行数和列数
	  for(row=1;row<=dimx;row++) {
		  for(col=1;col<=dimy;col++) {
			  // 矩阵相加，a+b=c
			  arrC[(row-1)][(col-1)] = arrA[(row-1)][(col-1)]+arrB[(row-1)][(col-1)];
			  
		  }
	  }
  }
  //主方法
  public static void main(String[] args) {
	int i,j;
	// 定义矩阵的行数和列数
	final int Rows = 3;
	final int Cols = 3;
	// A的矩阵
	int [][] A = {{1,3,5},  
                                              			{7,9,11},
                                              			{13,15,17}};
	// b的矩阵
	int [][] B = {{9,8,7},
			                                            {6,5,4},
			                                            {3,2,1}};
	
	
	// c的矩阵
	int [][] C = new int [Rows][Cols];
	System.out.println("[矩阵A的各个元素]");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			System.out.print(A[i][j]+" \t");
			System.out.println();;
		}
	}
	System.out.println("[矩阵B的各个元素]");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			System.out.print(B[i][j]+" \t");
			System.out.println();
		}
	}
	Add(A,B,C,3,3);
System.out.println("[显示矩阵A和矩阵B相加的结果]");
for(i=0;i<3;i++) {
	for(j=0;j<3;j++) {
		System.out.print(C[i][j]+" \t");
		System.out.println();
	}
}
}
}
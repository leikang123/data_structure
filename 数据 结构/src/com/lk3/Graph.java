package com.lk3;
/**
 * 
 * @author mac1094
 *
 */

public class Graph {
	private Vertex[] vertex;
	private int currentSize;
	int[][] adjMat;
	private MyStack stack = new MyStack();
	
	public Graph(int size) {
		vertex=new Vertex[size];
		adjMat=new int[size][size];
	}
   public void addVertex(Vertex v) {
	   // 向图中加入顶点
	   vertex[currentSize++]=v;
	  
   }
   int index1=0;
   public void addEdge(String v1,String v2) {
	   for(int i=0;i<vertex.length;i++) {
		   if(vertex[i].getValue().equals(v1)) {
			   index1= i;
			   break;
		   }
	   }
	   
	   int index2=0;
	   adjMat[index1][index2]=1;
	   adjMat[index2][index1]=1;
   }
   // 深度遍历算法
   public void dfs() {
	   // 把第0个顶点开始作为访问记录
	   vertex[0].visited=true;
	   // 把第0个顶点的下标
	   stack.push(0);
	   // 打印顶点的值
	   System.out.println(vertex[0].getValue());
	   // 遍历
	   while(!stack.isEmpty()) {
		int currentIndex = 0;
		for(int i=currentIndex+1;i<vertex.length;i++) {
			   if(adjMat[currentIndex][i]==1 && vertex[i].visited==false) {
				   stack.push(i);
				   vertex[i].visited=true;
				   System.out.println(vertex[i].getValue());
				   
			   }
		   }
		   // 弹出栈顶元素
		stack.pop();
		// 修改当前位置为栈顶元素的位置。
		currentIndex=stack.peek();
		
	   }
	   
   }
}

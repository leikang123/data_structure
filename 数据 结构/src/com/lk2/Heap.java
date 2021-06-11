package com.lk2;
/**
 * 堆的实现
 * 堆是用数组来实现的
 * @author mac1094
 *
 */

public class Heap {
	private int[] arr;
	//堆中元素个数
	private int count;
	// 堆的大小
	private int capacity;
	// 最小堆和堆大堆
	private int heap_type;
	
	public Heap(int capacity,int heap_type) {
		this.heap_type =heap_type;
		this.capacity = capacity;
		this.count=count;
		this.arr = new int[capacity];
	}
	
       // 堆的左孩子方法
	public int leftChild(int i) {
		int left = 2*i+1;
		if(left>=this.count) {
			return-1;
		}
		return left;
		
	}
	  // 堆的右孩子方法
	public int rightChild(int i) {
		int right = 2*i+2;
		if(right>=this.count) {
			return-1;
		}
		return right;
		
	}
	// 节点的双亲
	public int Parent(int i) {
		if(i<=0 || i>this.count) {
			return-1;
		}
		
		
		return i-1/2;
		
	}
	// 获取最大元素
	public int getMaximum() {
		if(this.count==0) {
			return-1;
			
		}
		
		return this.arr[0];
		
	}
	
	// 插入元素
	public int insert(int data) {
		int i;
		if(this.count == this.capacity) {
			ResizeHeap();
			this.count++;
			i=this.count-1;
			while(i>=0 && data >this.arr[(i-1)/2]) {
				this.arr[i] = this.arr[(i-1)/2];
				i=i-1 /2;
			}
			this.arr[i]=data;
		}
		return data;
		
	}
	// 删除元素

	private void ResizeHeap() {
		int[] arr_old =new int [this.capacity];
		System.arraycopy(this.arr,0,arr_old,this.count-1, capacity);
		if(this.arr == null) {
			System.out.println("merroy Error");
			return ;
		}
		for(int i=0;i<this.capacity;i++) {
			this.arr[i] = arr_old[i];
			this.capacity *=2;
			arr_old = null;
		}
		
	}
	// 清空堆
	public void DestoryHeap() {
		// 堆的大小没有，也就是0；
		this.count =0;
		// 数组为空
		this.arr = null;
	}
	// 数组创建堆
	public void BuildHeap(Heap h,int A[],int n) {
		if( h == null) {
			return;
		}
		while(n>this.capacity) {
			h.ResizeHeap();
			
		}
		for(int i =0;i<n;i++) {
			h.arr[i]=A[i];
			this.count = n;
		}
		for(int i =(n-1)/2;i>=0;i--) {
			h.PercolateDown(i);
		}
	}
   // 堆化当前元素，也就是看那个元素不符合，就重新更换元素，结构不变
	private void PercolateDown(int i) {
		int l,r,max,temp;
		l=leftChild(i);
		r=rightChild(i);
		if(l !=-1 && this.arr[l]>this.arr[i]) {
			max=l;
		}else 
			max=i;
		if(r !=-1 && this.arr[r] >this.arr[max]) {
			max=r;
			
		}
		if(max !=i) {
			temp =this.arr[i];
			this.arr[i]= this.arr[max];
			this.arr[max] = temp;
		}
		PercolateDown(max);
	}
	
}

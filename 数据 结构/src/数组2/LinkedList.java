package 数组2;
  // 建立连表类
public class LinkedList {
	// 连表头
	private Node first;
	// 连表尾部
	private Node last;
	
	//判断是否为空
	public boolean isEmpty() {
		return first == null;
		
	}

	// 输入
	public void print() {
		Node current=first;
		while(current !=null) {
			System.out.println("["+current.data+" "+current.name+""+current.np+"]");
			current=current.next;
			
		}
		System.out.println();
	}
  public void insert(int data,String names,int np) {
	  Node newNode=new Node(data,names,np);
	  if(this.isEmpty()) {
		  first=newNode;
		  last=newNode;
	  }else {
		  last.next=newNode;
	      last=newNode;
	  } 
  }
  // 删除方法
  public void delete(Node delNode) {
	  Node newNode;
	  Node tmp;
	  if(first.data == delNode.data) {
		  first=first.next;
	  }else if(last.data == delNode.data){
		  System.out.println("I am here/n");
		   newNode = first;
		   while(newNode.next!=last)
			   newNode=newNode.next;
		   newNode.next=last.next;
		  
	  }else {
		  newNode=first;
		  tmp =first;
		  while(newNode.data !=delNode.data) {
			  tmp=newNode;
			  newNode=newNode.next;
		  }
		  tmp.next=delNode.next;
	  }
	  
  }
  // 插入方法
  public void insert(Node ptr) {
	  // 临时节点
	  Node tmp;
	  // 新的节点
	  Node newNode;
	  // 判断节点是否为空,空的话，就是一个节点了
	  if(this.isEmpty()) {
		  first=ptr;
		  last=ptr;
	  }else {
		  // 如果是第一个节点
		  if(ptr.next==first) {
			  ptr.next=first;
			  ptr=first;
			  
		  }else {
			  // 如果新的节点在尾部
			  if(ptr.next==null) {
				  ptr.next=last;
				  ptr=last;
			  }else {
				 //插入中间
				  newNode=first;
				  tmp=first;
				  while(ptr.next !=newNode.next) {
					  tmp=newNode;
					  newNode=newNode.next;
					  
				  }
				  tmp.next=ptr;
				  ptr.next=newNode;
			  }
		  }
	  }
	  
  }
  
}

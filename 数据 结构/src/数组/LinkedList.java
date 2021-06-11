package 数组;
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
}

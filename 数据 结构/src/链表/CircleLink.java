package 链表;

public class CircleLink {
	public Node first;
	public Node last;
	
	
	public boolean isEmpty() {
		
		return first==null;
		
	}

	public void print() {
		Node current = first;
		while(current != last) {
			System.out.println("["+current.data+"]");
			current=current.next;
			
		}
		System.out.print("["+current.data+"]");
		System.out.println();
	}
	//插入节点
	public void insert(Node ptr) {
		Node newNode;
		Node tmp;
		if(this.isEmpty()) {
		   first=ptr;
		   last=ptr;
		   last.next=first;
			
		}else if(ptr.next == null){
			last.next=ptr;
			last=ptr;
			last.next=first;
			
		}newNode =first;
		 tmp=first;
		 while(newNode.next !=ptr.next) {
			 if(tmp.next==first) {
				 break;
			 }
			 tmp=newNode;
			 newNode=newNode.next;
		 }
		 tmp.next=ptr;
		 ptr.next=newNode;
	}
	// 删除节点方法
public void delete(Node delNode) {
     Node newNode;
     Node tmp;
     if(this.isEmpty()) {
    	 System.out.println("环形链表己经空了");
    	 return;
     }
     if(first.data == delNode.data) {
    	 first=first.next;
    	 if(first==null) {
    		 System.out.println("环形链表己经空了");
    		 return;
    	 }
    	 
     }else if(last.data == delNode.data) {
    	 newNode=first;
    	 while(newNode.next!=last);
    	 newNode=newNode.next;
    	 newNode.next=last.next;
    	 last=newNode;
    	 last.next = first;
     }else {
    	 newNode=first;
    	 tmp=first;
    	 while(newNode.data !=delNode.data) {
    		 tmp=newNode;
    		 newNode=newNode.next;
    	 }
    	 tmp.next=delNode.next;
     }
    	 
    
}
}

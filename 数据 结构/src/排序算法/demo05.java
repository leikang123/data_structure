package 排序算法;
/**
 * 归并排序
 * 难度有点大
 * @author mac1094
 *数组较多int A[] ,int temp[]，开辟空间所需要的时间复杂度：O(n);
 *时间复杂度：O(nlogn);
 */

public class demo05 {
	public void Mergesort(int A[] ,int temp[],int left,int right) {
		int mid;
		if(right>left) {
			mid = (right+left)/2;
			Mergesort(A,temp,left,mid);
			Mergesort(A, temp, mid+1, right);
			Merge(A, temp, left,mid+1, right);
		}
		
	}

	public  void Merge(int[] A, int[] temp, int left, int mid, int right) {
		int i,left_end,size,temp_pos;
		left_end=mid-1;
		temp_pos =left;
		size=right-left+1;
		while((left <=left_end) && (mid<=right)) {
			if(A[left]<=A[mid]) {
				temp[temp_pos]=A[left];
				temp_pos=temp_pos+1;
				left = left+1;
				
				
			}else {
				temp[temp_pos]=A[left];
				temp_pos=temp_pos+1;
				mid=mid+1;
			}
		}
		while(left<=left_end) {
			temp[temp_pos]=A[left];
			left=left+1;
			temp_pos=temp_pos+1;
			
		}
		while(mid<=right) {
			temp[temp_pos]=A[mid];
			mid=mid+1;
			temp_pos=temp_pos+1;
		}
		for(i=0;i<size;i++) {
			A[right]=temp[right];
			
			right=right-1;
		}
	}
	

}

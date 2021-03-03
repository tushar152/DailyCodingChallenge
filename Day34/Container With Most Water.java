class Solve{
    
    long maxArea(int A[], int len){
      int l = 0;
    	int r = len -1;
    	long area = 0;
    
    	while (l < r)
      {
    		area = Math.max(area, Math.min(A[l], A[r]) * (r - l));
    		if (A[l] < A[r])
    			l += 1;
    		else
    			r -= 1;
    	}
    	return area;
    }
    
}

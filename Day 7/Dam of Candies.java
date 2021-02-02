class Solution 
{ 
	static int maxCandy(int height[], int n) 
	{ 
	    // Your code goes here
	    int low = 0, high = n-1;
	    int breadth, max_candy = 0;
	    
	    while(low < high){
	        breadth = high - low -1;
	        
	        max_candy = Math.max(max_candy, breadth * (Math.min(height[low], height[high])));
	        if(height[low] < height[high])
	            low++;
	        else
	            high--;
	    }
	    return max_candy;
	}
}

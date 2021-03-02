class Solution{

    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n)
    {
        //Initialising index of first minimum and first maximum element. 
    	int max_idx = n - 1, min_idx = 0; 
    
    	 //Storing maximum element of array.
    	int max_elem = arr[n - 1] + 1; 
    
    	for (int i = 0; i < n; i++) { 
    	    
    		//At even index, we have to put maximum elements in decreasing order. 
    		if (i % 2 == 0) { 
    			arr[i] += (arr[max_idx] % max_elem) * max_elem; 
    			//Updating maximum index.
    			max_idx--; 
    		} 
    
    		//At odd index, we have to put minimum elements in increasing order. 
    		else { 
    			arr[i] += (arr[min_idx] % max_elem) * max_elem; 
    			//Updating minimum index.
    			min_idx++; 
    		} 
    	} 
    
    	//Dividing array elements by maximum element to get the result. 
    	for (int i = 0; i < n; i++) 
    		arr[i] = arr[i] / max_elem;
        
    }
    
}

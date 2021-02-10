class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
		Stack<Integer> s = new Stack<Integer>(); 
		int result[] = new int[n];
 		Arrays.fill(result, -1); 

		for (int i = 0; i < n; i++) { 

			if (s.empty()) { 
				s.push(i); 
				continue; 
			} 

			while (s.empty() == false && arr[s.peek()] > arr[i]) { 
				result[s.peek()] = arr[i]; 
				s.pop(); 
			} 
			s.push(i); 
		} 
		return result; 
	} 	
}

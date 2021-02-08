class Solution 
{ 
	static int digitSum(int n) { 
		int sum = 0; 
		while (n != 0) 
		{ 
			sum += (n % 10); 
			n /= 10; 
		} 
		return sum; 
	} 
	
	static int RulingPair(int arr[], int n) { 
	
		HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>(); 
		
		for (int i = 0; i < 1000 ; i++) 
		{ 
			mp.put(i, 0); 
		} 
		
		int ans = -1; 

		for (int i = 0; i < n; i++) 
		{ 
			int dSum = digitSum(arr[i]); 
			
			if ((int)mp.get(dSum) != 0) 
			{ 
				ans = Math.max(ans, (int)mp.get(dSum) + arr[i]); 
			} 
			mp.put(dSum,Math.max((int)mp.get(dSum), arr[i])) ; 
		} 
		return ans; 
	}    
}

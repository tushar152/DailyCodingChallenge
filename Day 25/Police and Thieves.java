class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
		int result = 0; 
		ArrayList<Integer> thief = new ArrayList<Integer>(); 
		ArrayList<Integer> police = new ArrayList<Integer>(); 

		for (int i = 0; i < n; i++) { 
			if (arr[i] == 'P') 
			police.add(i); 
			else if (arr[i] == 'T') 
			thief.add(i); 
		} 
		
		int l = 0, r = 0; 
		while (l < thief.size() && r < police.size()) { 
		    
			if (Math.abs(thief.get(l) - police.get(r)) <= k) { 
				result++; 
				l++; 
				r++; 
			} 
			else if (thief.get(l) < police.get(r)) 
				l++; 
			else
				r++; 
		} 
		return result; 
	} 
}

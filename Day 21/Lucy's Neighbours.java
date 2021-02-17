class Fun{
	int distance;
	int houseno;

	Fun(int x,int y)
	{
		distance = x;
		houseno = y;
	}
}

class Compare implements Comparator<Fun>{ 
	public int compare (Fun p1,Fun p2 )
	{
		if (p1.distance == p2.distance)	{
			if (p1.houseno < p2.houseno)
				return +1;
			if (p1.houseno > p2.houseno)
				return -1;
			return 0;
		}

		else {
		   	if (p1.distance < p2.distance)
				return +1;
			if (p1.distance > p2.distance)
				return -1;
			return 0;
		}
	}
}

class Solution 
{ 
	public  ArrayList<Integer> Kclosest(int arr[], int n, int x, int k) 
	{ 
		ArrayList<Integer> result= new ArrayList<Integer>();
		PriorityQueue<Fun> pq = new PriorityQueue<Fun>(k, new Compare()); 

		for (int i = 0; i < k; i++) 
		{
			Fun obj = new Fun(Math.abs(arr[i] - x) , arr[i] );
			pq.add(obj); 
		}

		for (int i = k; i < n; i++) 
		{ 
			int diff = Math.abs(arr[i] - x); 
			if (diff > pq.peek().distance) 
				continue; 

			if (diff == pq.peek().distance && arr[i] > pq.peek().houseno) 
				continue; 

			pq.remove();
			Fun obj = new Fun(Math.abs(arr[i] - x) , arr[i] );
			pq.add(obj);
		} 
		while (pq.size() >0) { 
			result.add(pq.peek().houseno);
			pq.remove();
		}
		Collections.sort(result);
		return result;
	}    
}

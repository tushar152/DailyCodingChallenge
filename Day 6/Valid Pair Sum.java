class Solution
{
  static long ValidPair(int a[], int n)
  {
    long sum = 0;
    int front = 0, tail = n-1;
    Arrays.sort(a);
    
    while(front < tail){
      if((a[front] + a[tail]) > 0){
        sum += (tail - front);
        --tail;
      else
        ++front;
    }
    return sum;
 }
}

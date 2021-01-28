class Solution { 
    long smallestpositive(long[] array, int n){ 
        // Your code goes here 
        Arrays.sort(array);
        long smallno = 1;
        for(int i = 0; i < n && array[i] <= smallno; i++){
            smallno += array[i];
        }
        return smallno;
    }
} 

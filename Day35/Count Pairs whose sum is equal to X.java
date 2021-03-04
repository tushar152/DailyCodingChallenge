class GfG {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int count = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        Iterator<Integer> itr1 = head1.iterator();
        
        while (itr1.hasNext()) 
        {
            h.add(itr1.next());
        }
        
        Iterator<Integer> itr2 = head2.iterator();
        
        while (itr2.hasNext())
        {
            if (h.contains(x - itr2.next()))
            {
                count++;
            }
        }
        return count;
    }
}

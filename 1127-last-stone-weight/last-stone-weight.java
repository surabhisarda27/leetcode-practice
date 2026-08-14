class Solution {
    public int lastStoneWeight(int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : a)
            pq.add(i);
        while(pq.size() > 1){
            int x = pq.remove();
            int y = pq.remove();
            if(x!=y){
                pq.add(Math.abs(x-y));
            }
        }
        return pq.size() == 0 ? 0 : pq.peek();
    }
}
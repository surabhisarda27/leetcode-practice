class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> de = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            if(de.isEmpty())
                de.addLast(i);
            else{
                while(!de.isEmpty() && arr[de.peekLast()] < arr[i])
                    de.removeLast();
                de.addLast(i);
            }
        }
        ans[0] = arr[de.peekFirst()];
        int x=1;
        for(int i=k;i<n;i++){
            if(de.isEmpty())
                de.addLast(i);
            else{
                while(!de.isEmpty() && arr[de.peekLast()] < arr[i])
                    de.removeLast();
                de.addLast(i);
            }
            while(de.peekFirst() < i-k+1)
                de.removeFirst();
            ans[x++] = arr[de.peekFirst()];   
        }
        return ans;
    }
}
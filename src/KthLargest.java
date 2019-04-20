import java.util.PriorityQueue;

public class KthLargest {
    // https://leetcode.com/problems/kth-largest-element-in-an-array/

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public int finKthLargest(int[] nums, int k) {
        for(int num:nums) {
            if(pq.size()<k) {
                pq.offer(num);
            } else {
                if(num > pq.peek()) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
        return pq.peek();
    }
}

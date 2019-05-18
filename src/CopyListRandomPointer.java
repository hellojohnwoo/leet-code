// https://leetcode.com/problems/copy-list-with-random-pointer/description/

import java.util.HashMap;
import java.util.Map;

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) {this.label = x;}
};


public class CopyListRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode cur = newHead;

        map.put(head, newHead);

        while (head != null) {
            if (!map.containsKey(head.next)) {
                map.put(head.next, new RandomListNode(head.next.label));
            }
            cur.next = map.get(head.next);
        }

        if (head.random != null) {
            if (!map.containsKey(head.random)) {
                map.put(head.random, new RandomListNode(head.random.label));
            }
            cur.random = map.get(head.random);
        }

        head = head.next;
        cur = cur.next;

        return newHead;
    }
}

public class MajorityElement {
    /*
        1. HashMap<Integer,Integer>
            Time  Complex : O(n)
            Space Complex : O(n)

        2. Double - For loop
            T.C : O(n^2)
            S.C : O(1)

        3.  Boyer-Moore Majority vote Algorithm
            T.C : O(n)
            S.C : O(1)
     */


    public int majorityElement(int[] nums) {
        int x = 0, cnt = 0;
        for(int num:nums) {
            if(cnt ==0) {
                x = num;
                cnt++;
            } else if (x == num) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return x;
    }
}

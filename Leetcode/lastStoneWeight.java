//Question
//We have a collection of stones, each stone has a positive integer weight.
// Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
// If x == y, both stones are totally destroyed;
// If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
// At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        int diff = 0;
        int i = 0;
        while (i < n) {
            if (n == 1) {
                return stones[0];
            }
            Arrays.sort(stones);
            if (n == 2) {
                return stones[1] - stones[0];
            }

            diff = stones[n - 1] - stones[n - 2];
            if (diff != 0) {
                stones[n - 1] = diff;
                stones[n - 2] = 0;
            } else {
                stones[n - 1] = 0;
                stones[n - 2] = 0;
            }
            i++;
            // System.out.println(Arrays.toString(stones));
        }
        for (int k = 0; k < n; k++) {
            if (stones[k] != 0) {
                return stones[k];
            }
        }
        return 0;
    }
}
package algorithm.leetcode.easy;

public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int out = start;
        for (int i = start + 2; i < start + 2 * n; i += 2) {
            out ^= i;
        }
        return out;
    }
}

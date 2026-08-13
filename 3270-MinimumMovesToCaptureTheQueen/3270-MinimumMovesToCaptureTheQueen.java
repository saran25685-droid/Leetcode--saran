// Last updated: 13/08/2026, 09:21:44
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == e) {
            if (c == a && ((b < d && d < f) || (f < d && d < b))) {
                return 2;
            }
            return 1;
        }
        if (b == f) {
            if (b == d && ((a < c && c < e) || (e < c && c < a))) {
                return 2;
            }
            return 1;
        }
        int x = Math.max(e - c, c - e);
        int y = Math.max(f - d, d - f);
        if (x == y) {
            int u = Math.max(a - c, c - a);
            int v = Math.max(b - d, d - b);
            if (u == v && u < x) {
                if (((c < a && a < e) || (e < a && a < c)) && ((d < b && b < f) || (f < b && b < d))) {
                    return 2;
                }
            }
            return 1;
        }
        return 2;
    }
}
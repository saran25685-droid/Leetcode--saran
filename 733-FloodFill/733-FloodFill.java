// Last updated: 13/08/2026, 09:37:22
class Solution {
    private boolean inBound(int i, int j, int[][] image) {
        return 0 <= i && i < image.length && 0 <= j && j < image[0].length;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor == color) {
            return image;
        }

        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = color;

        int[][] directions = new int[][]{
                {-1, 0}, {0, -1},
                {1, 0}, {0, 1}
        };

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            int x = current[0], y = current[1];

            for (int[] d : directions) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (inBound(nx, ny, image) && image[nx][ny] == startColor) {
                    image[nx][ny] = color;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return image;
    }
}
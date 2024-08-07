package Algorithm.gold4;
/**
 * 연구소
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Gold4_연구소_14502 {
    static int answer = 0;
    static int n;
    static int m;

    static void backtrack(int[][] maps, int count) {
        if (count == 3) {
            answer = Math.max(answer, bfs(maps));
            return;
        }
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (maps[i][j] == 0) {
                    maps[i][j] = 1;
                    backtrack(maps, count + 1);
                    maps[i][j] = 0;
                }
            }
        }
    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int bfs(int[][] maps) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        int[][] tempMaps = new int[n][m];
        Queue<Pair> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempMaps[i][j] = maps[i][j];
                if (maps[i][j] == 2) {
                    que.add(new Pair(i, j));
                    visited[i][j] = true;
                    count++;
                }
                if (maps[i][j] == 1) {
                    count++;
                }
            }
        }
        while (!que.isEmpty()) {
            Pair p = que.remove();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (isValid(nx, ny) && maps[nx][ny] == 0 && !visited[nx][ny]) {
                    que.add(new Pair(nx, ny));
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
        return n * m - count;
    }

    static boolean isValid(int x, int y) {
        if (x >= 0 && y >= 0 && x < n && y < m) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] maps = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maps[i][j] = scanner.nextInt();
            }
        }

        backtrack(maps, 0);

        System.out.println(answer);
    }
}
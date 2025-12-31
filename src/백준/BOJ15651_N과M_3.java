package 백준;

import java.io.*;
import java.util.*;

public class BOJ15651_N과M_3 {
    static int N;
    static int R;
    static int arr[];

    static int permutation[];

    static StringBuffer sb=new StringBuffer();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        permutation = new int[R];

        arr = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }
        DFS(0);
        System.out.println(sb.toString());
        br.close();

    }

    static void DFS(int level) {
        if (level == R) {
            for (int i = 0; i < R; i++) {
                sb.append(permutation[i] + " ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < N; i++) {
                permutation[level] = arr[i];
                DFS(level + 1);
            }
        }
    }
}

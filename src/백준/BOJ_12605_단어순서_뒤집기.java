package 백준;

import java.io.*;
import java.util.*;

public class BOJ_12605_단어순서_뒤집기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++) {
            queue.offer(i+1);
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<k-1;j++) {
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll()+" ");
        }

        br.close();

    }
}


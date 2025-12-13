package 백준;

import java.util.*;
import java.io.*;


public class BOJ_10815_숫자카드 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        Map<Integer, Integer> userMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> intMap = new LinkedHashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            userMap.put(Integer.parseInt(st.nextToken()), 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            intMap.put(x, userMap.getOrDefault(x, 0));

        }
        for (int i : intMap.values()) {
            System.out.print(i + " ");
        }

        br.close();

    }
}
package 백준;

import java.io.*;
import java.util.*;

public class BOJ_2910_빈도_정렬 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        Map<Integer, List<Integer>> answerMap = new TreeMap<Integer, List<Integer>>(Collections.reverseOrder());

        int arr[] = new int[n + 1];
        arr[n] = Integer.MAX_VALUE;

        stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(stringTokenizer.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (!answerMap.containsKey(map.get(key))) {
                answerMap.put(map.get(key), new ArrayList<Integer>());
            }
            answerMap.get(map.get(key)).add(key);

        }

        for (int key : answerMap.keySet()) {
            for(int j=0;j<answerMap.get(key).size();j++) {
                for (int i = 0; i < key; i++) {
                    System.out.print(answerMap.get(key).get(j) + " ");
                }
            }
        }
        br.close();
    }
}

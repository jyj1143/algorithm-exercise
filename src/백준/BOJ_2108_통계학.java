package 백준;

import java.io.*;
import java.util.*;

public class BOJ_2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n+1];
        arr[n]=Integer.MAX_VALUE;
        double sum = 0;
        int ave = 0;



        int center;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        ave = (int)Math.round(sum / n);
        center = arr[n / 2];

        int max=Integer.MIN_VALUE;

        int count = 1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (!map.containsKey(count)) {
                    map.put(count, new ArrayList<Integer>());
                }
                map.get(count).add(arr[i]);
                max=Math.max(max,count);
                count = 1;
            }
        }

        System.out.println(ave);
        System.out.println(center);

        if(map.get(max).size()>=2) {
            System.out.println(map.get(max).get(1));
        }else {
            System.out.println(map.get(max).get(0));
        }

        System.out.println(arr[n-1]-arr[0]);

        br.close();

    }
}

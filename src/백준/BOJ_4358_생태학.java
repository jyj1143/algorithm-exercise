package 백준;

import java.io.*;
import java.util.*;

public class BOJ_4358_생태학 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new TreeMap<>();
        double total = 0;
        String str;
//		while ((str = br.readLine()).length() != 0) {
        while ((str = br.readLine())!= null) {
            map.put(str, map.getOrDefault(str, 0) + 1);
            total++;
        }

        for (String key : map.keySet()) {
            System.out.printf("%s %.4f\n", key, map.get(key) / total * 100);
        }

        br.close();
    }
}

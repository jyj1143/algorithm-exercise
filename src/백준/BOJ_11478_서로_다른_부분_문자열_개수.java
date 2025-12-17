package 백준;

import java.io.*;
import java.util.*;

public class BOJ_11478_서로_다른_부분_문자열_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char cArr[] = new char[str.length()];
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                set.add(str.substring(i, j + 1));
            }
        }
        System.out.println(set.size());
        br.close();
    }
}

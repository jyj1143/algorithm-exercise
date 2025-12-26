package 백준;

import java.io.*;
import java.util.*;


public class BOJ_20055_평범한_배낭 {
    static class Point {

        int durability;
        boolean isRotot;

        public Point(int durability, boolean isRotot) {

            this.durability = durability;
            this.isRotot = isRotot;
        }

    }

    static int num;
    static int k;
    static Point[] durablitityArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        durablitityArr = new Point[num * 2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num * 2; i++) {
            durablitityArr[i] = new Point(Integer.parseInt(st.nextToken()), false);
        }
        int count = 0;
        int answer = 0;
        while (count < k) {
            answer++;

            Point latsPoint = durablitityArr[(num * 2) - 1];
            for (int i = (num * 2) - 1; i >= 1; i--) {
                durablitityArr[i] = durablitityArr[i - 1];

            }
            durablitityArr[0] = latsPoint;

            durablitityArr[num - 1].isRotot = false;
            for (int i = num - 2; i >= 0; i--) {
                if (durablitityArr[i].isRotot && !durablitityArr[i + 1].isRotot
                    && durablitityArr[i + 1].durability > 0) {
                    durablitityArr[i + 1].durability--;
                    durablitityArr[i + 1].isRotot = true;
                    durablitityArr[i].isRotot = false;
                    if (durablitityArr[i + 1].durability == 0) {
                        count++;
                    }
                }
            }

            if (durablitityArr[0].durability > 0) {
                durablitityArr[0].isRotot = true;
                durablitityArr[0].durability--;
                if (durablitityArr[0].durability == 0) {
                    count++;
                }
            }

            durablitityArr[num - 1].isRotot = false;

        }
        System.out.println(answer);
        br.close();

    }

}
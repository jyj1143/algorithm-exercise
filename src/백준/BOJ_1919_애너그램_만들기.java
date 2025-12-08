import java.util.*;
import java.io.*;

public class BOJ_1919_애너그램_만들기 {

    static int alpha1[] = new int[26];
    static int alpha2[] = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String x = br.readLine();
        String y = br.readLine();
        int answerCount = 0;

        for (int i = 0; i < x.length(); i++) {
            int index = x.charAt(i) - 'a';
            alpha1[index]++;
        }

        for (int i = 0; i < y.length(); i++) {
            int index = y.charAt(i) - 'a';
            alpha2[index]++;
        }

        for (int i = 0; i < 26; i++) {
            int dif = Math.abs(alpha1[i] - alpha2[i]);
            answerCount += dif;
        }

        // System.out.println(Arrays.toString(alpha1) );
        // System.out.println(Arrays.toString(alpha2) );
        System.out.println(answerCount);

        bw.flush();
        bw.close();
    }
}
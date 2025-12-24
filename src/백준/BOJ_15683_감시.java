package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_15683_감시 {
    public static void main(String[] args ) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Integer[] alpha = new Integer[26];
        Arrays.fill(alpha, 0);

        for(int i=0;i<str.length();i++){
            int index = Character.toUpperCase(str.charAt(i)) - 'A';
            alpha[index]++;
        }

        counter(alpha);

        br.close();
    }

    public static void counter(Integer[] alpha){
       int max = 0;
       char answer = '?';
       boolean isDuplicated = false;


       for(int i=0;i<alpha.length;i++){
        if(alpha[i] == max){
            isDuplicated = true;
        } else if(alpha[i] > max){
            max = alpha[i];
            answer = (char)(i + 'A');
            isDuplicated = false;
        }
       }

       if(isDuplicated){
        System.out.println("?");
       }else {
        System.out.println(answer);
       }

       
    }
}

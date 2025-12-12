import java.util.*;
import java.io.*;

public class BOJ_2744_대소문자_바꾸기{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for(int i=0; i<str.length() ; i++){
            char c =str.charAt(i);
            
            if(Character.isUpperCase(c)){
                bw.write(Character.toLowerCase(c));
            }else{
                bw.write(Character.toUpperCase(c));
            }

        }

        bw.flush();
        bw.close();
    }
}
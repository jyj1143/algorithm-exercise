import java.util.*;
import java.io.*;


public class BOJ_3273_두_수의_햡 {
    
    static int N;
    static boolean arr[];
    static int X;
    static int SIZE = 2000001;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int answer = 0;

        N = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        arr=new boolean[SIZE];
        
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(st.nextToken());
            arr[input] = true;
        }
        X = Integer.parseInt(br.readLine());

         for(int i=0;i<SIZE;i++){
           if(arr[i] 
                && (X - i) >= 0 
                && arr[X - i]){
            answer++;
           }
        }

        System.out.println(answer/2);
        br.close();
    }
}

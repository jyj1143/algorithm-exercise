import java.util.*;
import java.io.*;

public class BOJ_10989_수_정렬하기3 {

    static int N;
    static int arr[];
    public static void main(String[] args)throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        N =Integer.parseInt(br.readLine());
        arr = new int[10001];

        for(int i=0;i<N;i++){
           int x =  Integer.parseInt(br.readLine());
           arr[x]++;
        }
        for(int i=1;i<10001;i++){
            while(arr[i]>0){
                 bw.write(i+"\n");
                 arr[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
    
}

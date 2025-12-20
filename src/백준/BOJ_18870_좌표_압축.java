package 백준;

import java.io.*;
import java.util.*;

public class BOJ_18870_좌표_압축 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int[] copyArr=new int[n];
        System.arraycopy(arr, 0, copyArr, 0, n);
        Arrays.sort(arr);

        Map<Integer, Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++) {
            if(!map.containsKey(arr[i])) {

                map.put(arr[i], count);
                count++;
            }
        }


        for(int i:copyArr) {
            bw.write(map.get(i) +" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

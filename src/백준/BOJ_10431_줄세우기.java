package 백준;

import java.util.*;
import java.io.*;
/*
 1. 첫번째 위치부터 끝위치 까지 순회
 2. 현재 위치에서 앞에 자기보다 큰값이 있는지 확인
    2-1. 큰 값이 있으면 자신과 스왑하면서 자리 변경
 */
public class BOJ_10431_줄세우기 {

    static int P;
    static int STUDENT_COUNT = 20;
    static int[][] board;
    static int[] answer ;
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        P= Integer.parseInt(br.readLine()); 
        board=new int[P][STUDENT_COUNT];
        answer =new int[P];
        for(int p =0;p<P;p++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            st.nextToken();
            
            for(int i =0;i<STUDENT_COUNT;i++){
                board[p][i] =  Integer.parseInt(st.nextToken());
            }
        }

        for(int p =0;p<P;p++){
            for(int i = 1;i<STUDENT_COUNT;i++){
                for(int j=0;j<i;j++){
                    if(board[p][i] < board[p][j]){
                        for(int k =i;j < k;k--){
                            answer[p]++;
                            int tmp = board[p][k];
                            board[p][k] = board[p][k-1];
                            board[p][k-1] = tmp;
                            
                        }
                    }
                }
            }
        }
        for(int i=0;i<P;i++){
            System.out.println(i+1+" "+answer[i]);
        }


        br.close();
    }
}

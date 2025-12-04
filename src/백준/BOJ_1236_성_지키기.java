import java.util.*;
import java.io.*;


public class BOJ_1236_성_지키기 {

    static char EMPTY = '.';
    static char GUARD = 'X';
    static int X;
    static int Y;
    static char[][]board;
    public static void main(String[] args)throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int empytRow = 0;
        int empytColum = 0;

        
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        board = new char[X][Y];
         for(int i=0;i<X;i++){
            st = new StringTokenizer(br.readLine());
            String row = st.nextToken();
           for(int j=0;j<Y;j++){
              board[i][j] = row.charAt(j);
            }
        }


        for(int i=0;i<X;i++){
           goto1:for(int j=0;j<Y;j++){
             if( board[i][j] == GUARD){              
                break goto1;
             }
             if(j==Y-1){
                empytRow++;
             }
            }
        }

        for(int i=0;i<Y;i++){
           goto1:for(int j=0;j<X;j++){
             if( board[j][i] == GUARD){               
                break goto1;
             }
             if(j==X-1){
                empytColum++;
             }
            }
        }
        System.out.println(Math.max(empytRow,empytColum) );
      
        br.close();

    }


}
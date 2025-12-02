import java.util.*;
import java.io.*;
/*
1 글자 순회
2 같은 글자 있는지 확인
2.1 같으면 카운팅
2.1.1 같으면 글자 수 만큼 인덱스 이동
*/

public class BOJ_1543_문서_검색 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String findStr = br.readLine();
        int count =0;
        
        
        for(int i=0 ;i<input.length(); ){
            int index = input.indexOf(findStr, i);
           if(index < 0 ){
                break;
            }else{
                count++;
                i = index+findStr.length();
            }
        }

        System.out.println(count);

        br.close();
    }
}

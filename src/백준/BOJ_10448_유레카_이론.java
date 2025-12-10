import java.util.*;
import java.io.*;



public class BOJ_10448_유레카_이론{

    static int T ;

    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int k =  Integer.parseInt(br.readLine());
            boolean flag = solution(k);

            if(flag){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }

        br.close();
    }

    static boolean solution(int k){
    

        for(int i = 1 ;i<= k;i++){
            int I = i*(i+1)/2;
            for(int j = 1 ;j<= k;j++){
                 int J = j*(j+1)/2;

                if((I+J) >= k){
                    break;
                }

                for(int l = 1 ;l<= k;l++){
        
                    int L = l*(l+1)/2;
                    if((I+J+L) > k){
                        break;
                    }

                    if((I+J+L) == k){
                        return true;
                    }

                }
            }
        }
        
        return false;

    }




}
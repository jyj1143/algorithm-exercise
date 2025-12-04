import java.util.*;
import java.io.*;

/*
로봇팔로 혼냄
물컵에 소금 잔뜩
현재시각과 언제 컵을 사용할지 시간 앎
수 계산에 약해 로봇팔에 입력해야할 시간 계산을 못한다
철수가 로봇팔에 알맞은 시간을 입력할수 있도록

 */

public class BOJ_13223_소금_폭탄 {

    static int ONE_MINUTE = 60;
    static int ONE_HOURE = 60*60;

    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String currentTime = br.readLine();
        String actioinTime = br.readLine();
        StringTokenizer st =new StringTokenizer(currentTime,":");

        int currentHH = Integer.parseInt(st.nextToken()) ;
        int currentMM = Integer.parseInt(st.nextToken());
        int currentSS = Integer.parseInt(st.nextToken());



        st =new StringTokenizer(actioinTime,":");

        
        int actionHH = Integer.parseInt(st.nextToken());
        int actionMM = Integer.parseInt(st.nextToken());
        int actionSS = Integer.parseInt(st.nextToken());
        
        
        int current = currentHH*ONE_HOURE + currentMM*ONE_MINUTE +currentSS;
        int action = actionHH*ONE_HOURE + actionMM*ONE_MINUTE +actionSS;

       if(current >=  action){
            action += 24*ONE_HOURE;
        }
        int diff = action - current;
        int diffHH = diff /ONE_HOURE;
        int diffMM = (diff % ONE_HOURE)/ONE_MINUTE;
        int diffSS = ((diff % ONE_HOURE)%ONE_MINUTE);

        String answer = String.format("%02d:%02d:%02d", diffHH, diffMM,diffSS);
        System.out.println(answer);
        br.close();
    }
}

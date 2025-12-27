import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int suger = Integer.parseInt(N);

        //3의 경우 1
        if(suger == 3) System.out.println(1);
        //4와 7의 경우 -1, 못 나눔
        else if(suger == 4 || suger == 7) System.out.println(-1);
        //5로 나누어 떨어졌을 때
        else if(suger % 5 == 0) System.out.println(suger / 5);
        //5로 나누었을 때 나머지가 1인 경우
        else if(suger % 5 == 1 || suger % 5 == 3) System.out.println(suger / 5 + 1);
        //5로 나누었을 때 나머지가 2인 경우
        else if(suger % 5 == 2 || suger % 5 == 4) System.out.println(suger / 5 + 2);
    }
}
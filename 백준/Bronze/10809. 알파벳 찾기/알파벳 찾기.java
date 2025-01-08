import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int cnt[] = new int[26];
        Arrays.fill(cnt, -1);

        int check[] = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
            check[i] = (int)S.charAt(i) - 97;
            if(cnt[check[i]] == -1) // cnt 배열의 값이 -1일 경우에만 초기화
                cnt[check[i]] = i;
        }

        for(int i = 0; i < cnt.length; i++){
            bw.write(cnt[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
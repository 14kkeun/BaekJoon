import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < T; i++){
            st   = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            int len = S.length();
            int cnt = 0;
            for(int j = 0; j < len; j++){
                for(int k = 0; k < R; k++){
                    bw.write(S.charAt(cnt));
                }
                cnt++;
            }
            bw.write("\n");
        }



        bw.flush();
        bw.close();
    }
}
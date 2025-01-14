import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cnt = new int[10001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            cnt[Integer.parseInt(br.readLine())]++; // 수 자체를 카운트
        }

        for(int i = 1; i < 10001; i++){
            while(cnt[i] > 0){
                bw.write(i + "\n");
                cnt[i]--;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
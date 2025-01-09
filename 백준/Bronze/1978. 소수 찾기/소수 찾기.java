import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2)
                total++;

            cnt = 0;
        }

        bw.write(String.valueOf(total));

        br.close();
        bw.flush();
        bw.close();
    }
}
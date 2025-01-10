import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            for(int j = i + 1; j < M; j++) {
                for(int k = j + 1; k < N; k++) {

                    sum = arr[i] + arr[j] + arr[k];

                    if(M == sum) {
                        max = sum;
                        break;
                    }

                    if(max < sum && sum < M){
                        max = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.flush();
        bw.close();
    }
}
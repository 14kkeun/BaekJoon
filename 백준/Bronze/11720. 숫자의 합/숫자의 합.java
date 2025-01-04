import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String X = br.readLine();

        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = X.charAt(i) - 48;
        }

        int sum = 0;

        for(int i = 0; i<N; i++){
            sum += arr[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
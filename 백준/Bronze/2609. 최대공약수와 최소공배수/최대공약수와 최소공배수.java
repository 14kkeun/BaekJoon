import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int d = gcd(A, B);

        bw.write(d + "\n");
        bw.write(String.valueOf(A * B / d));

        br.close();
        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) { // 유클리드 호제법
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
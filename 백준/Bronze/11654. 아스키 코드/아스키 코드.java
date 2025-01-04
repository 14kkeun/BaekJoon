import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char X = br.readLine().charAt(0);
        int N = X;

        bw.write(String.valueOf(N));

        bw.flush();
        bw.close();
    }
}
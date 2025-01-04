import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        int A, B, RS;

        StringTokenizer st1;
        for(int i=0; i<T; i++){
            st1 = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st1.nextToken());
            B = Integer.parseInt(st1.nextToken());
            RS = A+B;
            bw.write(RS + "\n");
        }

        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int A, B, C;

        while(true){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            A *= A;
            B *= B;
            C *= C;

            if(A == 0 || B == 0 || C == 0){
                break;
            }

            if(A+B == C || A+C == B || B+C == A)
                bw.write("right\n");
            else
                bw.write("wrong\n");
        }

        bw.flush();
        bw.close();
    }
}
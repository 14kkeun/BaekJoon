import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        String D = A+B;

        int N1 = Integer.parseInt(A);
        int N2 = Integer.parseInt(B);
        int N3 = Integer.parseInt(C);
        int N4 = Integer.parseInt(D);

        int RS = N1 + N2 - N3;

        bw.write(RS + "\n");
        bw.write(String.valueOf(N4 - N3));

        bw.flush();
        bw.close();
    }
}
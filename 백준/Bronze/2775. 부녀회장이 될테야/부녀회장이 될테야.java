import java.io.*;

public class Main {

    public static int[][] APT = new int [15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        make_APT();

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(APT[k][n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void make_APT() {
        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1; // i층 1호 --> 1
            APT[0][i] = i; // 0층 i호 --> i
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i-1][j] + APT[i][j-1];
            }
        }
    }


}
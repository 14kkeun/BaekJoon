import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[N];
        double max = 0;
        for(int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if(max < score[i]) {
                max = score[i];
            }
        }

        double[] score2 = new double[N];
        double avg = 0;
        for(int i = 0; i < N; i++) {
            score2[i] = score[i] / max * 100;
            avg += score2[i];
        }

        bw.write(String.valueOf(avg / N));
        br.close();
        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int Height;
            int Width;
            if(N % H == 0) {
                Height = H * 100;
                Width = N / H;
            }
            else {
                Height = (N % H) * 100;
                Width = N / H + 1;
            }

            bw.write(Height + Width + "\n");
        }

        bw.flush();
        bw.close();
    }
}
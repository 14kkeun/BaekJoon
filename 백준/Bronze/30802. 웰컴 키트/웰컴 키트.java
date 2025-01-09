import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] size = new int[6];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size.length; i++){
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i = 0; i < size.length; i++){
            cnt += size[i] / T;
            if(size[i] % T != 0){
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.write(N / P + " " + N % P);

        br.close();
        bw.flush();
        bw.close();
    }
}
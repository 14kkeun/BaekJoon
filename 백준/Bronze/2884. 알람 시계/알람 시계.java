import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int M2 = M -  45;
        if(M2 < 0){
            H -= 1;
            M = 60 + M2;
            if(H < 0)
                H = 23;
        }else{
            M -= 45;
        }

        bw.write(H + " " + M);
        bw.flush();
        bw.close();
    }
}
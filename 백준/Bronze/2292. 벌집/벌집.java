import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int check = 1;
        int mul = 6;
        int cnt = 1;
        for(int i = 1; i <= N; i++){
            if(N <= check){
                break;
            }
            check += mul;
            mul += 6;
            cnt++;
        }

        bw.write(cnt + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
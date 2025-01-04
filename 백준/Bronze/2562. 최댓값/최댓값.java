import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        int max = arr[0];
        for(int i = 0; i < 9; i++){
            if(max <= arr[i]){
                max = arr[i];
                cnt = i + 1;
            }
        }

        bw.write(max + "\n");
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}
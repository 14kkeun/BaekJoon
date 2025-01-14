import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Math.max(A, B);
        int max1 = 0; // 최대공약수
        int max2 = 0; // 최소공배수


        for (int i = 1; i <= C; i++) {
            if(A % i == 0 && B % i == 0) {
                max1 = i;
            }
        }

        int[] arr1 = new int[C];
        int[] arr2 = new int[C];
        for(int i = 0; i < C; i++) {
            arr1[i] = A * (i + 1);
            arr2[i] = B * (i + 1);
        }

        Loop1 :
        for(int i = 0; i < C; i++) {
            Loop2 :
            for(int j = 0; j < C; j++) {
                if(arr1[i] == arr2[j]) {
                    max2 = arr1[i];
                    break Loop1;
                }
            }
        }

        bw.write(max1 + "\n");
        bw.write(String.valueOf(max2));
        br.close();
        bw.flush();
        bw.close();
    }
}
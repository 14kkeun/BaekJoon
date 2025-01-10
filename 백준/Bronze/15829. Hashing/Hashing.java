import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int arr[] = new int[L];
        for (int i = 0; i < L; i++) {
            arr[i] = (int)str.charAt(i) - 96;
        }

        int sum = 0;
        int r = 31;
        for(int i = 0; i < L; i++){
            r = 31;
            r = (int)Math.pow(r, i);
            sum += arr[i] * r;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();


    }

}
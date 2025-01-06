import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        boolean bi;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            bi = false;
           for(int j = i + 1; j < 10; j++){
               if(arr[i] == arr[j]){
                   bi = true;
                   break;
               }
           }

           if(bi == false){
               cnt++;
           }
        }


        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
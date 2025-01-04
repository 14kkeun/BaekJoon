import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        if(year % 4 == 0){
            if(year % 100 != 0){
                bw.write(String.valueOf(1));
            }else if (year % 400 == 0){
                bw.write(String.valueOf(1));
            }else{
                bw.write(String.valueOf(0));
            }
        }else{
            bw.write(String.valueOf(0));
        }

        bw.close();
    }
}
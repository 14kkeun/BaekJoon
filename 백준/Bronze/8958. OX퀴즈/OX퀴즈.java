import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String str = br.readLine();

            int len = str.length();

            int total = 0;
            int O = 0;
            for(int j = 0; j < len; j++){
                if(str.charAt(j) == 'O'){
                    O++;
                }else{
                    O = 0;
                }
                total += O;
            }

            bw.write(total + "\n");
        }

        bw.flush();
        bw.close();
    }
}
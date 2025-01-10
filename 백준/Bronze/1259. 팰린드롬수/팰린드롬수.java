import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String n = br.readLine();
            if(Integer.parseInt(n) == 0){
                break;
            }

            int check = n.length() / 2;

            boolean flag = true;
            int j = n.length() - 1;
            for(int i = 0; i < check; i++){

                if(n.charAt(i) != n.charAt(j))
                    flag = false;

                j--;
            }

            if(flag){
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        Double A = Double.parseDouble(st.nextToken());
        Double B = Double.parseDouble(st.nextToken());
        sb.append(A / B);

        System.out.println(sb);
    }
}
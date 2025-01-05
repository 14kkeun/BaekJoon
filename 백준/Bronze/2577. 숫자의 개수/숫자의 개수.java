import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String RS = String.valueOf(A*B*C);

        int[] arr = new int[10];
        Arrays.fill(arr, 0);

        int radix = 10;

        for(int i = 0; i < RS.length(); i++){
            if(Character.forDigit(0, radix) == (RS.charAt(i))){
                arr[0]++;
            }else if(Character.forDigit(1, radix) == (RS.charAt(i))){
                arr[1]++;
            }else if(Character.forDigit(2, radix) == (RS.charAt(i))){
                arr[2]++;
            }else if(Character.forDigit(3, radix) == (RS.charAt(i))){
                arr[3]++;
            }else if(Character.forDigit(4, radix) == (RS.charAt(i))){
                arr[4]++;
            }else if(Character.forDigit(5, radix) == (RS.charAt(i))){
                arr[5]++;
            }else if(Character.forDigit(6, radix) == (RS.charAt(i))){
                arr[6]++;
            }else if(Character.forDigit(7, radix) == (RS.charAt(i))){
                arr[7]++;
            }else if(Character.forDigit(8, radix) == (RS.charAt(i))){
                arr[8]++;
            }else{
                arr[9]++;
            }
        }

        for(int i = 0; i < 10; i++){
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
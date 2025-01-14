import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        if(isNumeric(s1)){
            int n1 = Integer.parseInt(s1);
            int result = n1 + 3;
            bw.write(fizzbuzz(result));
        }else if(isNumeric(s2)){
            int n2 = Integer.parseInt(s2);
            int result = n2 + 2;
            bw.write(fizzbuzz(result));
        }else if(isNumeric(s3)){
            int n3 = Integer.parseInt(s3);
            int result = n3 + 1;
            bw.write(fizzbuzz(result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static String fizzbuzz(int n) {
        if(n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz";
        }else if(n % 3 == 0){
            return "Fizz";
        }else if(n % 5 == 0){
            return "Buzz";
        }else{
            return String.valueOf(n);
        }
    }
}
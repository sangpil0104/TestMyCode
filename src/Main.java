import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int result=0;

        //============================================

        for (int i = 1; i < n; i++) {
            int input = i;
            int sum = 0;

            while (input !=0) {
                sum += input % 10;
                input /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }

        }
        System.out.println(result);

















    }
}
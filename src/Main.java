import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int Num = str.length();

        int[] arr = new int[Num];

        for(int i = 0; i < Num; i++) {

            arr[i] = str.charAt(i);
        }

        for(int i = 0; i < Num - 1; i++) {
            for(int j = i + 1 ;j < Num; j++) {
                if(arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i : arr) {
            int j = i;
            sb.append((char)j);
        }
        System.out.print(sb);
    }

}
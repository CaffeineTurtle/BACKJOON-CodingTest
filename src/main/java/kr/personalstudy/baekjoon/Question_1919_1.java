package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_1919_1 {
    public static void main(String[] args) throws IOException{
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String input1 = buffer.readLine().trim().toLowerCase();
            String input2 = buffer.readLine().trim().toLowerCase();

            if (input1.length() != input2.length()) {
                System.exit(-1);
            }

            int duplicationNumber = input1.length() + input2.length();

            char[] charArrayList1 = input1.toCharArray();
            char[] charArrayList2 = input2.toCharArray();

            for (char ch1 : charArrayList1) {
                for (char ch2 : charArrayList2) {
                    if (ch1 == ch2) {
                        duplicationNumber--;
                        continue;
                    }
                }
            }
            System.out.println(duplicationNumber);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

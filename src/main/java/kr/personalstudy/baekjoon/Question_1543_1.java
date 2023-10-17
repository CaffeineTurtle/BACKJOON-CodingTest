package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_1543_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str1 = buffer.readLine().trim().toLowerCase();
        String str2 = buffer.readLine().trim().toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int i = 0;
        boolean tr = false;
        boolean currentTr = false;
        boolean previousTr = false;
        int sum = 0;
        int number = 0;
        for (char c : charArray1) {
            if(c == charArray2[i]){
                tr = true;
            }else{
                tr = false;
            }
            i++;
            if((tr == true) && (i == charArray2.length)){
                tr = false;
            }

            currentTr = tr;
            if((!currentTr) && (previousTr)){
                sum++;
            }
            previousTr = currentTr;

            if(i == charArray2.length){
                i = 0;
            }
        }
        System.out.println(sum);
    }
}

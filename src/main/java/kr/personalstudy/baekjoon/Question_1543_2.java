package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_1543_2 {
    public static int checkDuplicate(String s1, String s2){
        int i = 0;
        int j = s1.length() - 1;
        int k = s2.length();
        int sum = 0;

        while(i < s1.length()){
            if(s1.substring(i, j).contains(s2) == true){
                sum++;
            }
            i = s1.indexOf(s2, i);
            if(i == -1){
                break;
            }
            i += k;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str1 = buffer.readLine().trim().toLowerCase();
        String str2 = buffer.readLine().trim().toLowerCase();

        int sum = checkDuplicate(str1, str2);

        System.out.println(sum);
    }
}

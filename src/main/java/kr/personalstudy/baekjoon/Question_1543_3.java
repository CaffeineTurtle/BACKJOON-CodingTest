package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question_1543_3 {
    public static void main(String[] args) throws IOException {
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//        String str1 = buffer.readLine().trim().toLowerCase();
//        String str2 = buffer.readLine().trim().toLowerCase();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int i = 0;
        int j = str1.length() - 1;
        int k = str2.length();
        int sum = 0;

//        while(true){
        while(i < str1.length()){
//            if(str1.substring(i, j).contains(str2) == true){
//                sum++;
//            }
            i = str1.indexOf(str2, i);
            if(i == -1){
                break;
            }
            i += k;
            sum++;
        }

        System.out.println(sum);
    }
}

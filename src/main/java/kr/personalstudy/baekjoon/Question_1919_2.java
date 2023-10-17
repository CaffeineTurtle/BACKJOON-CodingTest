package kr.personalstudy.baekjoon;

import java.util.Scanner;

public class Question_1919_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        if(input1.length() != input2.length()){
            System.exit(-1);
        }

        int duplicationNumber = input1.length() + input2.length();

        char[] charArrayList1 = input1.toCharArray();
        char[] charArrayList2 = input2.toCharArray();

        for(char ch1 : charArrayList1){
            for(char ch2 : charArrayList2){
                if(ch1 == ch2){
                    duplicationNumber--;
                    continue;
                }
            }
        }
        System.out.println(duplicationNumber);
    }
}
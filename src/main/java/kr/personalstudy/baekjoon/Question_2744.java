package kr.personalstudy.baekjoon;

import java.util.Scanner;

public class Question_2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabet = scanner.next();
        char[] indexValue = alphabet.toCharArray();
        for(int i = 0; i < alphabet.length(); i++){
            if(('A' <= indexValue[i]) && (indexValue[i] <= 'Z')){
                indexValue[i] = String.valueOf(indexValue[i]).toLowerCase().charAt(0);
            }else if(('a' <= indexValue[i]) && (indexValue[i] <= 'z')){
                indexValue[i] = String.valueOf(indexValue[i]).toUpperCase().charAt(0);
            }
        }
        System.out.println(indexValue);
    }
}

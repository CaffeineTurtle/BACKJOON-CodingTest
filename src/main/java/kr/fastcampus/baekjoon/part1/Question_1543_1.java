package kr.fastcampus.baekjoon.part1;

import java.util.Scanner;

public class Question_1543_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doc = scanner.nextLine();
        String word = scanner.nextLine();

        int count = 0;
        int startIndex = 0;
        while(true){
            int findIndex = doc.indexOf(word, startIndex);
            if(findIndex < 0){
                break;
            }
            count++;
            startIndex = findIndex + word.length();
        }
        System.out.println(count);
    }
}

package kr.fastcampus.baekjoon.part1;

import java.util.Scanner;

public class Question_1543_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doc = scanner.nextLine();
        String word = scanner.nextLine();

        String replaced = doc.replace(word, "");
        int length = doc.length() - replaced.length();
        int count = length / word.length();
        System.out.println(count);
    }
}

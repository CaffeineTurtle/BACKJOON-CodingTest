package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question_1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//        String str = buffer.readLine().trim().toUpperCase();
        String str = buffer.readLine().trim().replaceAll(" ", "").toLowerCase();

        char[] CharArray = str.toCharArray();
        Map<Character, Integer> charPriorityList = new HashMap<>();

        for(char c : CharArray){
            if(charPriorityList.containsKey(c)){
                charPriorityList.put(c, charPriorityList.get(c) + 1);
            }else{
                charPriorityList.put(c, 1);
            }
        }

        Set<Character> set = charPriorityList.keySet();
        int i = 0;
        int j = 0;
        char ch = ' ';
        for(char c: set){
            i = charPriorityList.get(c);
            if(i > j){
                ch = c;
                j = i;
            }else if(i == j){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}

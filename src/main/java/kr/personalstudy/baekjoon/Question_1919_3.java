package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Question_1919_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input1 = buffer.readLine().trim().toLowerCase();
        String input2 = buffer.readLine().trim().toLowerCase();

        if(input1.length() != input2.length()){
            System.exit(-1);
        }

        Map<Character, Integer> input1MapList = new HashMap<>();
        Map<Character, Integer> input2MapList = new HashMap<>();

        for(char c : input1.toCharArray()){
            if(input1MapList.containsKey(c)){
                int plusNumber = input1MapList.get(c);
                input1MapList.put(c, plusNumber+1);
                continue;
            }else{
                input1MapList.put(c, 1);
            }
        }
        for(char c : input2.toCharArray()){
            if(input2MapList.containsKey(c)){
                int plusNumber = input2MapList.get(c);
                input2MapList.put(c, plusNumber+1);
                continue;
            }else{
                input2MapList.put(c, 1);
            }
        }

        Set<Character> set1 = input1MapList.keySet();
//        Set<Map.Entry<Character,Integer>> set2 = input1MapList.entrySet();
//        System.out.println(set1);
//        System.out.println(set2);
        Set<Character> set3 = input2MapList.keySet();
//        Set<Map.Entry<Character,Integer>> set4 = input2MapList.entrySet();
//        System.out.println(set3);
//        System.out.println(set4);
        int duplicationSum = 0;

        for(char c : set1){
            if(input2MapList.containsKey(c)){
                if(input1MapList.get(c) == input2MapList.get(c)){
                    continue;
                }else{
                    duplicationSum += Math.abs(input1MapList.get(c) - input2MapList.get(c));
                }
            }else{
                duplicationSum += input1MapList.get(c);
            }
        }
        for(char c : set3){
            if(!input1MapList.containsKey(c)){
                duplicationSum += input2MapList.get(c);
            }
        }

        System.out.println(duplicationSum);
    }
}
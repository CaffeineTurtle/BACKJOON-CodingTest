package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_13223_3 {
    private static Integer[] stringToIntegerForTime(String str){
        String[] splitStrings = str.split(":");
        Integer[] intTime = new Integer[splitStrings.length];
        for(int i = 0; i < splitStrings.length; i++){
            intTime[i] = Integer.parseInt(splitStrings[i]);
        }
        return intTime;
    }

    private static Integer[] calculateForInputTime(Integer[] currentTime, Integer[] dropTime){
        Integer[] inputTime = new Integer[currentTime.length];
        if(currentTime.length == dropTime.length){
            for(int i = (currentTime.length - 1); i >= 0; i--){
                switch(i){
                    case 2:
                        for(int j = 0; j < 60; j++){
                            if(currentTime[i] != 60){
                                if(currentTime[i] == dropTime[i]){
                                    inputTime[i] = j;
                                    break;
                                }
                                currentTime[i]++;
                            }else{
                                currentTime[i - 1] += 1;
                                currentTime[i] = 0;
                                j--;
                            }
                        }
                        break;

                    case 1:
                        for(int k = 0; k < 60; k++){
                            if(currentTime[i] != 60){
                                if(currentTime[i] == dropTime[i]){
                                    inputTime[i] = k;
                                    break;
                                }
                                currentTime[i]++;
                            }else{
                                currentTime[i - 1] += 1;
                                currentTime[i] = 0;
                                k--;
                            }
                        }
                        break;

                    case 0:
                        for(int l = 0; l < 24; l++){
                            if(currentTime[i] != 24){
                                if(currentTime[i] == dropTime[i]){
                                    inputTime[i] = l;
                                    break;
                                }
                                currentTime[i]++;
                            }else{
                                currentTime[i] = 0;
                                l--;
                            }
                        }
                        break;

                    default:
                        break;
                }
            }
        }


        int verificationCount = 0;
        for(Integer i : inputTime){
            if(i == 0){
                verificationCount++;
            }

        }
        if(verificationCount == inputTime.length){
            inputTime[0] = 24;
        }
        return inputTime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String time1 = buffer.readLine().trim();
        String time2 = buffer.readLine().trim();

        Integer[] intTime1 = stringToIntegerForTime(time1);
        Integer[] intTime2 = stringToIntegerForTime(time2);

        Integer[] inputTime = calculateForInputTime(intTime1, intTime2);

        System.out.printf("%02d:%02d:%02d", inputTime[0], inputTime[1], inputTime[2]);
    }
}

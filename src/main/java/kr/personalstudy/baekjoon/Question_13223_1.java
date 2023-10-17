package kr.personalstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question_13223_1 {
    private static Integer[] stringToIntegerForTime(String str){
        String[] splitStrings = str.split(":");
        Integer[] intTime = new Integer[splitStrings.length];
        for(int i = 0; i < splitStrings.length; i++){
            intTime[i] = Integer.parseInt(splitStrings[i]);
        }
        return intTime;
    }

    private static Integer[] calculateForInputTime(Integer[] time1, Integer[] time2){
        Integer[] inputTime = new Integer[time1.length];
        if(time1.length == time2.length){
            for(int i = (time1.length - 1); i >= 0; i--){
                switch(i){
                    case 2:
                        for(int j = 0; j < 60; j++){
                            if(time1[i] != 60){
                                if(time1[i] == time2[i]){
                                    inputTime[i] = j;
                                    break;
                                }
                                time1[i]++;
                            }else{
                                time2[i - 1] -= 1;
                                time1[i] = 0;
                                j--;
                            }
                        }
                        break;

                    case 1:
                        for(int k = 0; k < 60; k++){
                            if(time1[i] != 60){
                                if(time1[i] == time2[i]){
                                    inputTime[i] = k;
                                    break;
                                }
                                time1[i]++;
                            }else{
                                time2[i - 1] -= 1;
                                time1[i] = 0;
                                k--;
                            }
                        }
                        break;

                    case 0:
                        for(int l = 0; l < 24; l++){
                            if(time1[i] != 24){
                                if(time1[i] == time2[i]){
                                    inputTime[i] = l;
                                    break;
                                }
                                time1[i]++;
                            }else{
                                time1[i] = 0;
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
        for(int i : inputTime){
            if(i == 0){
                verificationCount++;
            }

        }
        if(verificationCount == inputTime.length){
            inputTime[0] = 24;
        }
        return inputTime;
    }

    private static String inputTimeToString(Integer[] InputTime){
        StringBuilder time = new StringBuilder();

        for(Integer i : InputTime){
            if(i > 10){
                time.append(i + ":");
            }else{
                time.append("0" + i + ":");
            }
        }
        time.deleteCharAt(time.length() - 1);

        return time.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String time1 = buffer.readLine().trim();
        String time2 = buffer.readLine().trim();

        Integer[] intTime1 = stringToIntegerForTime(time1);
        Integer[] intTime2 = stringToIntegerForTime(time2);

        Integer[] inputTime = calculateForInputTime(intTime1, intTime2);

//        System.out.println("InputTime = " + Arrays.toString(inputTime));

        String time = inputTimeToString(inputTime);

        System.out.println(time);
    }
}

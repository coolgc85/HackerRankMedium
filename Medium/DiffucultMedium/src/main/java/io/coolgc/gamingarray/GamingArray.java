package io.coolgc.gamingarray;

import java.util.*;

public class GamingArray {

    static final String BOB_NAME ="BOB";
    static final String ANDY_NAME ="ANDY";


    private GamingArray() {
    }

    public static String gamingArray(List<Integer> arr) {
        if (arr != null && !arr.isEmpty()) {
            int max = 0;
            int playerNum = 0;
            for(Integer n : arr){
                if(max < n){
                    max = n;
                    playerNum++;
                }
            }
            return (playerNum % 2 == 0)?ANDY_NAME:BOB_NAME;
        } else{
            return null;
        }
    }
}

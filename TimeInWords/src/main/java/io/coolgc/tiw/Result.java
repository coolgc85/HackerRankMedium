package io.coolgc.tiw;

import java.util.*;


public class Result {

    private static final Map<Integer, String> hours;
    private static final Map<Integer, String> minutes;

   static{
       hours = new HashMap<>();
       hours.put(1,"one");
       hours.put(2,"two");
       hours.put(3,"three");
       hours.put(4,"four");
       hours.put(5,"five");
       hours.put(6,"six");
       hours.put(7,"seven");
       hours.put(8,"eight");
       hours.put(9,"nine");
       hours.put(10,"ten");
       hours.put(11,"eleven");
       hours.put(12,"twelve");

       minutes = new HashMap<>();
       minutes.put(0,"o' clock");
       minutes.put(1,"one minute past");
       minutes.put(2,"two minutes past");
       minutes.put(3,"three minutes past");
       minutes.put(4,"four minutes past");
       minutes.put(5,"five minutes past");
       minutes.put(6,"six minutes past");
       minutes.put(7,"seven minutes past");
       minutes.put(8,"eight minutes past");
       minutes.put(9,"nine minutes past");
       minutes.put(10,"ten minutes past");
       minutes.put(11,"eleven minutes past");
       minutes.put(12,"twelve minutes past");
       minutes.put(13,"thirteen minutes past");
       minutes.put(14,"fourteen minutes past");
       minutes.put(15,"quarter past");
       minutes.put(16,"sixteen minutes past");
       minutes.put(17,"seventeen minutes past");
       minutes.put(18,"eighteen minutes past");
       minutes.put(19,"nineteen minutes past");
       minutes.put(20,"twenty minutes past");
       minutes.put(21,"twenty one minutes past");
       minutes.put(22,"twenty two minutes past");
       minutes.put(23,"twenty three minutes past");
       minutes.put(24,"twenty four minutes past");
       minutes.put(25,"twenty five minutes past");
       minutes.put(26,"twenty six minutes past");
       minutes.put(27,"twenty seven minutes past");
       minutes.put(28,"twenty eight minutes past");
       minutes.put(29,"twenty nine minutes past");
       minutes.put(30,"half past");
       minutes.put(31,"twenty nine minutes to");
       minutes.put(32,"twenty eight minutes to");
       minutes.put(33,"twenty seven minutes to");
       minutes.put(34,"twenty six minutes to");
       minutes.put(35,"twenty five minutes to");
       minutes.put(36,"twenty four minutes to");
       minutes.put(37,"twenty three minutes to");
       minutes.put(38,"twenty two minutes to");
       minutes.put(39,"twenty one minutes to");
       minutes.put(40,"twenty minutes to");
       minutes.put(41,"forty one minutes to");
       minutes.put(42,"forty two minutes to");
       minutes.put(43,"forty three minutes to");
       minutes.put(44,"forty four minutes to");
       minutes.put(45,"quarter to");
       minutes.put(46,"fourteen minutes to");
       minutes.put(47,"thirteen minutes to");
       minutes.put(48,"twelve minutes to");
       minutes.put(49,"eleven minutes to");
       minutes.put(50,"ten minutes to");
       minutes.put(51,"nine minutes to");
       minutes.put(52,"eight minutes to");
       minutes.put(53,"seven minutes to");
       minutes.put(54,"six minutes to");
       minutes.put(55,"five minutes to");
       minutes.put(56,"four minutes to");
       minutes.put(57,"three minutes to");
       minutes.put(58,"two minutes to");
       minutes.put(59,"one minute to");
   }

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */


    public static String timeInWords(int h, int m) {

        String timeInWordsFinal = null;
        String hoursWords;

        if(m <= 30){
            if(m == 0) {
               return hours.get(h) + " " + minutes.get(m);
            }
            timeInWordsFinal = minutes.get(m)+" "+hours.get(h);
        } else{
            hoursWords = (hours.get(h+1) == null)?hours.get(1):hours.get(h+1);
            timeInWordsFinal = minutes.get(m)+" "+hoursWords;
        }
        return timeInWordsFinal;
    }
}




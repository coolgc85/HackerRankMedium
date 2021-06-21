import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {

    static Map<Integer, String> hours;
   static Map<Integer, String> minutes;
    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    /*Result(){
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
        minutes.put(00,"o' clock");
        minutes.put(01,"one minute past");
        minutes.put(02,"two minutes past");
        minutes.put(03,"three minutes past");
        minutes.put(04,"four minutes past");
        minutes.put(05,"five minutes past");
        minutes.put(06,"six minutes past");
        minutes.put(07,"seven minutes past");
        minutes.put(8,"eight minutes past");
        minutes.put(9,"nine minutes past");
        minutes.put(10,"ten minutes past");
        minutes.put(15,"quarter past");
        minutes.put(16,"sixteen minutes past");
        minutes.put(20,"twenty minutes past");
        minutes.put(30,"half past");
        minutes.put(40,"twenty minutes to");
        minutes.put(45,"quarter to");
        minutes.put(47,"thirteen minutes to");
    }*/


    public static String timeInWords(int h, int m) {
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
        minutes.put(00,"o' clock");
        minutes.put(01,"one minute past");
        minutes.put(02,"two minutes past");
        minutes.put(03,"three minutes past");
        minutes.put(04,"four minutes past");
        minutes.put(05,"five minutes past");
        minutes.put(06,"six minutes past");
        minutes.put(07,"seven minutes past");
        minutes.put(8,"eight minutes past");
        minutes.put(9,"nine minutes past");
        minutes.put(10,"ten minutes past");
        minutes.put(15,"quarter past");
        minutes.put(16,"sixteen minutes past");
        minutes.put(20,"twenty minutes past");
        minutes.put(29,"twenty nine minutes past");
        minutes.put(30,"half past");
        minutes.put(40,"twenty minutes to");
        minutes.put(45,"quarter to");
        minutes.put(47,"thirteen minutes to");

        String timeInWordsFinal = null;
        String minuteWords = null;

        if(m <= 30){
            if(m == 00) {
               return timeInWordsFinal = hours.get(h) + " " + minutes.get(m);
            }
            timeInWordsFinal = minutes.get(m)+" "+hours.get(h);
        } else if(m > 30){
            String hoursWords = (hours.get(h+1) == null)?hours.get(1):hours.get(h+1);
            timeInWordsFinal = minutes.get(m)+" "+hoursWords;
        }

        return timeInWordsFinal;
    }
}




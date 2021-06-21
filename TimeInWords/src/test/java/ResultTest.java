import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @org.junit.jupiter.api.Test
    void timeInWordsOClock() {
       // Result r = new Result();
        String result = Result.timeInWords(5, 0);
        assertTrue(result.contains("o' clock"));

    }

    @org.junit.jupiter.api.Test
    void timeInWordsTenMinutes() {

        String result = Result.timeInWords(5, 10);
        assertEquals("ten minutes past five", result);

    }

    @org.junit.jupiter.api.Test
    void timeInWordsQuarterPastFive() {

        String result = Result.timeInWords(5, 15);
        assertEquals("quarter past five", result);
    }

    @org.junit.jupiter.api.Test
    void timeInWordsSixteenPastFive() {

        String result = Result.timeInWords(5, 16);
        assertEquals("sixteen minutes past five", result);
    }

    @org.junit.jupiter.api.Test
    void timeInWordsHalfPastFive() {

        String result = Result.timeInWords(5, 30);
        assertEquals("half past five", result);

    }

    @org.junit.jupiter.api.Test
    void timeInWordsQuarterToSix() {

        String result = Result.timeInWords(5, 45);
        assertEquals("quarter to six", result);

    }

    @org.junit.jupiter.api.Test
    void timeInWordsThirteenToSix() {

        String result = Result.timeInWords(5, 47);
        assertEquals("thirteen minutes to six", result);

    }

}
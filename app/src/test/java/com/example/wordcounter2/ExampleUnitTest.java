package com.example.wordcounter2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = "";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void Given_Text_getWordsCount_ZeroReturned() {
        TextCounter to = new TextCounter();

        String givenString = "";

        int expectedValue = 0;
        int actualValue = to.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void Given_EmptyTxt_getCharsCount_ZeroReturned() {
        TextCounter to = new TextCounter();
        String givenString = "laba diena";

        int expectedValue = 2;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_EmptTxt_getCharsCount_ZeroReturned() {
        TextCounter to = new TextCounter();
        String givenString = "LabaRyta";

        int expectedValue = 1;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);

    }

}

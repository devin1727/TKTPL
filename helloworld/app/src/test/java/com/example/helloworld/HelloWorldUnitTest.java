package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class HelloWorldUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void multi_isCorrect() {
        assertEquals(4, 2 * 2);
    }
    @Test
    public void div_isCorrect() {
        assertEquals(1, 2 / 2);
    }
}
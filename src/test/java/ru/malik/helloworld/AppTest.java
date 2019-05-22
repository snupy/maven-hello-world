package ru.malik.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testMsg() {

        final String res = new App().msg();

        assertEquals("Hello world!!!", res);
    }
}
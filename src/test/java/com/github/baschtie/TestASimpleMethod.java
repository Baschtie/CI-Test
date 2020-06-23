package com.github.baschtie;

import com.github.baschtie.citest.MessageBuilder;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestASimpleMethod {

    @Test
    public void testMessage() {
        assertEquals("§cHi", MessageBuilder.colorMessageRed("Hi"));
    }
}

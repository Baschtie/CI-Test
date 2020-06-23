package com.github.baschtie.citest;

public class MessageBuilder {

    public static String colorMessageRed(String message) {
        StringBuffer result = new StringBuffer();

        result.append("§c");
        result.append(message);
        return result.toString();
    }
}

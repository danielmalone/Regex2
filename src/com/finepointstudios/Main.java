package com.finepointstudios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "How are you doing today?";
        System.out.println(text.replaceAll("ARE", ""));

        Pattern p = Pattern.compile("how", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found: " + m.group());
        }
    }
}

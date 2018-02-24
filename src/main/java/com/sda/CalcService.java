package com.sda;

import java.util.stream.Stream;

public class CalcService {
    public int calculate(String text) {
        String[] split = text == null ? new String[0] : text.split(";");
        int sum=0;
        for (int i = 0; i <split.length ; i++) {
            sum += Integer.valueOf(split[i]);

        }
        return sum;
    }
}

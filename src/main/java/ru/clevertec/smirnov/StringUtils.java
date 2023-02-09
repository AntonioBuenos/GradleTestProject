package ru.clevertec.smirnov;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str){
        return NumberUtils.toDouble(str) > 0;
    }
}

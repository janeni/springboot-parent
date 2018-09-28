package com.sunjx.springboot.utils;


import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Calendar;
import java.util.Locale;

public class DateUtils {

    public static String getCurrentDateByFormat(String format) {
        FastDateFormat dateFormat = FastDateFormat.getInstance(format);
        Calendar calendar = Calendar.getInstance(Locale.CHINESE);
        return dateFormat.format(calendar);
    }
}

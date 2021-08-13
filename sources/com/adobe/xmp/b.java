package com.adobe.xmp;

import java.util.Calendar;
import java.util.TimeZone;

public interface b extends Comparable {
    Calendar G();

    boolean N();

    boolean S();

    int V();

    boolean W();

    void b(int i);

    void c(int i);

    void d(int i);

    void e(int i);

    void f(int i);

    int getDay();

    int getHour();

    int getMinute();

    int getMonth();

    int getSecond();

    TimeZone getTimeZone();

    int getYear();

    void setMonth(int i);

    void setTimeZone(TimeZone timeZone);

    void setYear(int i);
}

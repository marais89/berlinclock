package com.olbati.berlinclock;

import com.google.common.base.Preconditions;

import java.time.LocalTime;

/**
 * Created by marais on 18/11/2016.
 */
public class BerlinClock {

    private BerlinClockHour berlinClockHour = new BerlinClockHour();

    private BerlinClockMinute berlinClockMinute = new BerlinClockMinute();

    private BerlinClockSecond berlinClockSecond = new BerlinClockSecond();

    public String[] convert(LocalTime time) {
        Preconditions.checkArgument(time != null, "time must not be null");

        String[] hours = berlinClockHour.convert(time.getHour());
        String[] minutes = berlinClockMinute.convert(time.getMinute());
        String seconds = berlinClockSecond.convert(time.getSecond());

        return new String[]{seconds, hours[0], hours[1], minutes[0], minutes[1]};
    }
}

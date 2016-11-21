package com.olbati.berlinclock;

/**
 * Created by marais on 18/11/2016.
 */
public class BerlinClockSecond {
    public String convert(int second) {
        if(second%2 == 0){
            return "Y";
        }

        return "O";

    }
}

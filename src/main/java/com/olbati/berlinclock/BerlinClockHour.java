package com.olbati.berlinclock;

/**
 * Created by marais on 18/11/2016.
 */
public class BerlinClockHour {

    public String[] convert(int hours) {
        int redTopLampsCount = hours / 5;
        int redBottomLampsCount = hours % 5;

        String topLamps = "";
        String bottomLamps = "";

        for (int i = 0; i < redTopLampsCount; i++) {
            topLamps += "R";
        }

        for (int i = 0; i < 4 - redTopLampsCount; i++) {
            topLamps += "O";
        }

        for (int i = 0; i < redBottomLampsCount; i++) {
            bottomLamps += "R";
        }

        for (int i = 0; i < 4 - redBottomLampsCount; i++) {
            bottomLamps += "O";
        }

        return new String[]{topLamps, bottomLamps};
    }
}

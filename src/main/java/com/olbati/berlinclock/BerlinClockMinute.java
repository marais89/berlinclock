package com.olbati.berlinclock;

/**
 * Created by marais on 18/11/2016.
 */
public class BerlinClockMinute {
    public String[] convert(int minute) {
        int redYellowTopLampsCount = minute / 5;
        int redBottomLampsCount = minute % 5;

        String topLamps = "";
        String bottomLamps = "";

        for (int i = 1; i < redYellowTopLampsCount+1; i++) {

            if(i%3 ==0) {
                topLamps += "R";
            }else {
                topLamps += "Y";
            }
        }

        for (int i = 1; i < 11 - redYellowTopLampsCount+1; i++) {
            topLamps += "O";
        }

        for (int i = 1; i < redBottomLampsCount+1; i++) {
            bottomLamps += "Y";
        }

        for (int i = 1; i < 4 - redBottomLampsCount+1; i++) {
            bottomLamps += "O";
        }

        return new String[]{topLamps, bottomLamps};
    }
}

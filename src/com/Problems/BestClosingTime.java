package com.Problems;

import java.util.Vector;

public class BestClosingTime {
    public static void main(String[] args) {
        System.out.println(bct("YYYY"));
    }
    static int bct(String cst) {
        int hour = 0;
        int ht = 0;
        int mpenalty = cst.length();
        while (hour <= cst.length()) {
            int penalty = 0;
            for (int i=0; i<hour; i++) {
                //shop is open
                if (cst.charAt(i) == 'N') {
                    penalty++;
                }
            }
            for (int j=hour; j<cst.length(); j++) {
                //shop is close
                if (cst.charAt(j) == 'Y') {
                    penalty++;
                }
            }
            if (penalty < mpenalty) {
                mpenalty = penalty;
                ht = hour;
            }
            hour++;
        }
        return ht;
    }
}

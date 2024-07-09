package com.woodyphillips.wp0724;

import java.util.Hashtable;

public class HARTApplication extends Thread {
    private Hashtable<String, HardwareTool> toolsDataBase;

    public HARTApplication(String... args) {
        // args passed in from CLI can be used here.
    }

    public HARTApplication() {
        this("");
    }

    public void run() {
        //  Need to do stuff in here
    }

    public boolean receivedInput(String s) {
        if (s != null && s.length() > 0) {
            return true;
        }
        return false;
    }
}
package org.cmmurielg;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                moveMouse();
            }
        }, 0, 1000);
    }

    private static void moveMouse() {
        try {
            Robot robot = new Robot();
            Point location = MouseInfo.getPointerInfo().getLocation();
            int x = location.x;
            int y = location.y;

            robot.mouseMove(x - 5, y -5);
            Thread.sleep(100);
            robot.mouseMove(x, y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
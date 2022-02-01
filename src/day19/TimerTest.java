package day19;

import javax.swing.*;

public class TimerTest {

    public static void main(String[] args) {
        Timer timer = new Timer(10000,new TimePrinter());
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

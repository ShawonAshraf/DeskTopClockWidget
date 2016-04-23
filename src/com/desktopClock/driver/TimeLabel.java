package com.desktopClock.driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shawon on 4/24/16.
 */
public class TimeLabel extends JLabel implements ActionListener {
    private String type;
    private SimpleDateFormat sdf;

    public TimeLabel(String type) {
        this.type = type;
        setForeground(Color.green);

        formatData();

        Timer t = new Timer(1000, this);
        t.start();

    }

    private void formatData() {
        switch (type) {
            case "date":
                sdf = new SimpleDateFormat("MMMM dd yyyy");
                setFont(new Font("sans-serif", Font.BOLD,  12));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "time":
                sdf = new SimpleDateFormat("hh:mm:ss a");
                setFont(new Font("sans-serif", Font.PLAIN, 40));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "day":
                sdf = new SimpleDateFormat("EEEE  ");
                setFont(new Font("sans-serif", Font.PLAIN, 16));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                sdf = new SimpleDateFormat();
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Date date = new Date();
        setText(sdf.format(date));
    }
}

package com.desktopClock.graphicalInterface;

import com.desktopClock.driver.TimeLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shawon on 4/23/16.
 */
public class GraphicalInterface extends JFrame {

    private TimeLabel time;
    private TimeLabel day;
    private TimeLabel date;
    private GridLayout gl;

    private final static int WINDOW_HEIGHT = 300;
    private final static int WINDOW_WIDTH = 150;

    public GraphicalInterface() {
        initGUIComponents();
        setLookAndFeel();
        addComponents();
        setWindowProp();
    }

    private void initGUIComponents() {
        time = new TimeLabel("time");
        day = new TimeLabel("day");
        date = new TimeLabel("date");
        gl = new GridLayout(3, 1);
    }

    private void setLookAndFeel() {
        try {
            String lafName = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(lafName);
        } catch (Exception e) {
            // let it fail
            // shamefur program
        }
    }

    private void setWindowProp() {
        setTitle("Clock Widget");
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void addComponents() {
        setLayout(gl);
        add(date);
        add(time);
        add(day);
    }


}

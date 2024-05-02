/*
 *  Start_Tufts_Shuttle_Tracker.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file tells the program to create and display a screen
 *  that will hold the Tufts Shuttle tracker simulation
 * 
 */
import java.awt.*;
import javax.swing.*;

public class Start_Tufts_Shuttle_Tracker {

    public Start_Tufts_Shuttle_Tracker() {
        Shuttle_Window the_shuttle_window = new Shuttle_Window();
        the_shuttle_window.setTitle("Tufts Shuttle Tracker"); 
        the_shuttle_window.setLayout (new BorderLayout()); 
        the_shuttle_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        the_shuttle_window.setVisible(true);
    }
    
}

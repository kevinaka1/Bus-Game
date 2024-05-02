/*
 *  Control_Panel4.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file shows the steps the program takes to create everything in Control_Panel4, which
 *  is the state panel. It shows the steps program takes display if the user won or not.
 * 
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Control_Panel4 extends JPanel{

    Canvas the_shuttle_map;
    Timer control_panel4_timer;

    JLabel control_panel_text = new JLabel();

    public Control_Panel4(Canvas init_shuttle_map){
        the_shuttle_map = init_shuttle_map;

        Updates_Listener uListener = new Updates_Listener();
        
        control_panel4_timer = new Timer(1000, uListener);

        control_panel4_timer.start();

        add(control_panel_text);
    }

    public class Updates_Listener implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent ae){
            if(!the_shuttle_map.timer.isRunning()){
                control_panel_text.setText(the_shuttle_map.the_state); 
                control_panel4_timer.stop();
            }
        }
    }

   
}

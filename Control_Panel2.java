/*
 *  Control_Panel2.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file shows the steps the program takes to everything in Control_Panel2.
 *  This includes stop, start and change speed buttons
 * 
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Control_Panel2 extends JPanel {
    Stop_Buses_Button stop_bus_button = new Stop_Buses_Button();
    Start_Buses_Button start_bus_button = new Start_Buses_Button();
    Change_Bus_Speed_Button change_bus_speed_button = new Change_Bus_Speed_Button();

    Canvas the_shuttle_pass;

    public Control_Panel2(Canvas init_shuttle_pass){
        the_shuttle_pass = init_shuttle_pass;

        stop_bus_button.setText("Click to stop the buses");
        start_bus_button.setText("Click to start the buses");
        change_bus_speed_button.setText("Change the bus speed of the buses");

        stop_bus_button.setBounds(200, 200, 100, 100);

        add(stop_bus_button);
        Stop_Bus_Button_Listener sbListener = new Stop_Bus_Button_Listener();
        stop_bus_button.addActionListener(sbListener);

        add(start_bus_button);
        Start_Bus_Button_Listener stbListener = new Start_Bus_Button_Listener();
        start_bus_button.addActionListener(stbListener);

        add(change_bus_speed_button);
        Change_Bus_Speed_Button_Listener cbListener = new Change_Bus_Speed_Button_Listener();
        change_bus_speed_button.addActionListener(cbListener);
    }

    public class Stop_Bus_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == stop_bus_button){
                the_shuttle_pass.timer.stop();
                change_bus_speed_button.setEnabled(false);
            }
        }
    }

    public class Start_Bus_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == start_bus_button){
                the_shuttle_pass.tick();
                change_bus_speed_button.setEnabled(true);
            }
        }
    }

    public class Change_Bus_Speed_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == change_bus_speed_button){
                Scanner speed_change = new Scanner(System.in);
                System.out.println("Enter new speed ");
                
                String new_speed = speed_change.nextLine();

                int new_speed_int = Integer.parseInt(new_speed);

                for(int i = 0; i < the_shuttle_pass.the_model.all_vehicles.size(); i++){
                    the_shuttle_pass.the_model.all_vehicles.get(i).speed = new_speed_int;
                }

                the_shuttle_pass.tick();
            }
        }
    }
}

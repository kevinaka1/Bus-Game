/*
 *  Control_Panel3.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file shows the steps the program takes to everything in Control_Panel3.
 *  This includes the change color and change a vehicle speed button. This shows the
 *  steps the program takes let the user change the color and speed of a specific
 *  vehicle
 * 
 */

import javax.swing.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.*;
import java.util.*;

public class Control_Panel3 extends JPanel{

    Canvas the_shuttle_map;
    Change_Color_Button change_color = new Change_Color_Button();
    Change_A_Vehicle_Speed_Button change_vehicle_speed = new Change_A_Vehicle_Speed_Button();
    JRadioButton redButton;
    JRadioButton greenButton;
    JRadioButton blueButton;
    JRadioButton yellowButton;
    JRadioButton orangeButton;


    public Control_Panel3(Canvas init_shuttle_map){
        the_shuttle_map = init_shuttle_map;

        ButtonGroup colorGroup = new ButtonGroup();

        redButton = new JRadioButton("Red");
        greenButton = new JRadioButton("Green");
        blueButton = new JRadioButton("Blue");
        yellowButton = new JRadioButton("Yellow");
        orangeButton = new JRadioButton("Orange");

        colorGroup.add(redButton);
        colorGroup.add(greenButton);
        colorGroup.add(blueButton);
        colorGroup.add(yellowButton);
        colorGroup.add(orangeButton);

        add(redButton);
        add(greenButton);
        add(blueButton);
        add(yellowButton);
        add(orangeButton);

        change_color.setText("Click to change a vehcile's color");
        add(change_color);
        Change_Color_Button_Listener ccbListener = new Change_Color_Button_Listener();
        change_color.addActionListener(ccbListener);

        change_vehicle_speed.setText("Click to change a vehicle's speed");
        add(change_vehicle_speed);
        Change_A_Vehicle_Speed_Button_Listener cvsbListener = new Change_A_Vehicle_Speed_Button_Listener();
        change_vehicle_speed.addActionListener(cvsbListener);

    }

    public class Change_Color_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == change_color){
                if(the_shuttle_map.chosen_vehicle == -1){
                    System.out.println("You did not choose a vehicle");
                }
                else{
                    if (redButton.isSelected()) {
                        the_shuttle_map.the_model.all_vehicles.get(the_shuttle_map.chosen_vehicle).vehicle_color = Color.red;
                    } 
                    else if (greenButton.isSelected()) {
                        the_shuttle_map.the_model.all_vehicles.get(the_shuttle_map.chosen_vehicle).vehicle_color = Color.green;
                    } 
                    else if (blueButton.isSelected()) {
                        the_shuttle_map.the_model.all_vehicles.get(the_shuttle_map.chosen_vehicle).vehicle_color = Color.blue;
                    }
                    else if (yellowButton.isSelected()) {
                        the_shuttle_map.the_model.all_vehicles.get(the_shuttle_map.chosen_vehicle).vehicle_color = Color.yellow;
                    } 
                    else if (orangeButton.isSelected()) {
                        the_shuttle_map.the_model.all_vehicles.get(the_shuttle_map.chosen_vehicle).vehicle_color = Color.orange;
                    }
                    else {
                        System.out.println("No color option selected");
                    }
                }
            
            }
        }
    }

    public class Change_A_Vehicle_Speed_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == change_vehicle_speed){
                if(the_shuttle_map.chosen_vehicle == -1){
                    System.out.println("You did not choose a vehcicle");
                }
                else{
                    Scanner the_speed_change = new Scanner(System.in);
                    System.out.println("Enter new speed ");
                    
                    String the_new_speed = the_speed_change.nextLine();

                    int the_new_speed_int = Integer.parseInt(the_new_speed);

                    the_shuttle_map.the_model.all_vehicles.get(the_shuttle_map.chosen_vehicle).speed = the_new_speed_int;
                    //System.out.println(" Car " + the_shuttle_map.chosen_vehicle + "is now " + the_new_speed_int);
                    the_shuttle_map.repaint();
                }

                
            }
        }
    }
}

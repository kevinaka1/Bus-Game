/*
 *  Control_Panel1.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file creates the add vehicle button seen on Control_Panel1, and shows
 *  the steps he program takes to add a user-customized vehicle. It also shows
 *  the steps the program takes to zoom in and out when the user wants to 
 * 
 */
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.*;

public class Control_Panel1 extends JPanel{
    Add_Vehicle_Button add_vehicle_button = new Add_Vehicle_Button();

    Zoom_Button zoom_in_button = new Zoom_Button();
    Zoom_Button zoom_out_button = new Zoom_Button();

    Canvas the_shuttle_map;

    public Control_Panel1(Canvas init_shuttle_map){

        the_shuttle_map = init_shuttle_map;

        add_vehicle_button.setText("Click to add a vehicle");
        add(add_vehicle_button);

        Add_Vehicle_Button_Listener avbListener = new Add_Vehicle_Button_Listener();
        add_vehicle_button.addActionListener(avbListener);

        zoom_in_button.setText("Click to zoom in");
        add(zoom_in_button);

        Zoom_In_Button_Listener zibListener = new Zoom_In_Button_Listener();
        zoom_in_button.addActionListener(zibListener);

        zoom_out_button.setText("Click to zoom out");
        add(zoom_out_button);

        Zoom_Out_Button_Listener zobListener = new Zoom_Out_Button_Listener();
        zoom_out_button.addActionListener(zobListener);




    }

    public class Add_Vehicle_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == add_vehicle_button){
                Bus new_bus = new Bus();

                Scanner x_pos = new Scanner(System.in);
                System.out.println("Enter starting x position ");
                String new_x_pos = x_pos.nextLine();
                int new_x_pos_int = Integer.parseInt(new_x_pos);
                new_bus.x_position = new_x_pos_int;

                Scanner y_pos = new Scanner(System.in);
                System.out.println("Enter starting y position ");
                String new_y_pos = y_pos.nextLine();
                int new_y_pos_int = Integer.parseInt(new_y_pos);
                new_bus.y_position = new_y_pos_int;

                Scanner bus_speed = new Scanner(System.in);
                System.out.println("Enter the bus's speed ");
                String new_bus_speed = bus_speed.nextLine();
                int new_bus_speed_int = Integer.parseInt(new_bus_speed);
                new_bus.speed = new_bus_speed_int;

                
                new_bus.vehicle_color = Color.magenta;
                new_bus.text_label = "";
                new_bus.type = "bus";
                new_bus.bus_width_end = new_bus.x_position + new_bus.bus_width;
                new_bus.bus_height_end = new_bus.y_position + new_bus.bus_height;

                the_shuttle_map.the_model.all_vehicles.add(new_bus);

                the_shuttle_map.repaint();
            }
        }
    }

    public class Zoom_In_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == zoom_in_button){
                the_shuttle_map.scale_factor *= 2;
                the_shuttle_map.repaint();
            }
        }
    }

    public class Zoom_Out_Button_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == zoom_out_button){
                the_shuttle_map.scale_factor =  the_shuttle_map.scale_factor * 0.5;
                the_shuttle_map.repaint();
            }
        }
    }

}
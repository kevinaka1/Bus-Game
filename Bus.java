/*
 *  Bus.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file shows the steps the program takes to create a bus, and
 *  see if a user clicked on a bus.
 * 
 */

import java.awt.*;

public class Bus extends Vehicles{
    int bus_width;
    int bus_height;
    int wheel_width;
    int wheel_height;
    int bus_width_end;
    int bus_height_end;

    public Bus(){
        bus_width = 100;
        bus_height = 50;
        wheel_width = 20;
        wheel_height = 20;
        bus_width_end = x_position + bus_width;
        bus_height_end = y_position + bus_height;
    }

    public Bus(int init_x_positon, int init_y_position, int init_speed, Color init_vehicle_color, 
                String init_text_tabel, String init_type){
        x_position = init_x_positon;
        y_position = init_y_position;
        speed = init_speed;
        vehicle_color = init_vehicle_color;
        text_label = init_text_tabel;
        type = init_type;
        bus_width = 100;
        bus_height = 50;
        wheel_width = 20;
        wheel_height = 20;
        bus_width_end = x_position + bus_width;
        bus_height_end = y_position + bus_height;
    }

    public void draw_bus(Graphics g){
        g.setColor(vehicle_color);
        g.fillRect(x_position, y_position, bus_width, bus_height);

        g.setColor(Color.black);
        g.fillOval(x_position, (y_position + bus_height), wheel_width, wheel_height);
        g.fillOval(((x_position - 20) + bus_width),(y_position + bus_height), wheel_width, wheel_height);
    }

    public boolean pick_correlation(int the_mouse_loc_x, int the_mouse_loc_y){
        if(the_mouse_loc_x >= x_position && the_mouse_loc_x <= bus_width_end){
            if(the_mouse_loc_y >= y_position && the_mouse_loc_y <= bus_height_end){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }
}

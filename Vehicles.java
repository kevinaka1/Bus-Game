/*
 *  Vehicles.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file shows the information the program needs to create vehicles, and it
 *  shows the steps the program takes to draw them
 * 
 */
import java.awt.*;

public class Vehicles {
    int x_position;
    int y_position;
    int speed;
    Color vehicle_color;
    String text_label;
    String type;
    Vehicles ptr;

    public Vehicles(){
        x_position = 0;
        y_position = 0;
        speed = 0;
        vehicle_color = Color.black;
        text_label = "";
        type = "";
    }

    public Vehicles(int init_x_positon, int init_y_position, String init_direction, int init_speed, Color init_vehicle_color, 
                    String init_text_tabel, String init_type, Vehicles init_ptr){
        x_position = init_x_positon;
        y_position = init_y_position;
        speed = init_speed;
        vehicle_color = init_vehicle_color;
        text_label = init_text_tabel;
        type = init_type;
        
    }

    public void draw_vehicles(Graphics g){
        if(type == "bus"){
            Bus place_bus = new Bus(x_position, y_position, speed, vehicle_color,
            text_label, type);
            place_bus.draw_bus(g);
        }
    }


}

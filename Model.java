/*
 *  Model.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 57
 * 
 *  This file shows the steps the program takes to create the Model class.
 *  This class holds all the information for every vehicle in a list, such as
 *  their starting positon and color, so when it's time to draw the vehicles, the
 *  program goes down the list.
 * 
 */

import java.awt.*;
import java.util.*;

public class Model {


    Bus davis_direct_bus;
    Bus davis_all_stops_bus;

    ArrayList <Bus> all_vehicles = new ArrayList<Bus>();


    public Model(){

        davis_direct_bus = new Bus(0, 110, 5, Color.red, "", "bus");
        
        all_vehicles.add(davis_direct_bus);

        davis_all_stops_bus = new Bus(110,110,5, Color.blue, "", "bus");

        all_vehicles.add(davis_all_stops_bus);
    }

    public void draw(Graphics g){
        for(int i = 0; i < all_vehicles.size(); i++){
            Vehicles curr_vehicle = all_vehicles.get(i);
            curr_vehicle.draw_vehicles(g);
        }
    }
}

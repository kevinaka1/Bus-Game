/*
 *  Canvas.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file shows the steps the program takes to create the panel in the middle
 *  of the screen, and everything in such as the bus drawings and grid. It also
 *  shows the steps the program takes to move the buses automatically.
 *  It also shows how the program uses mouse clicks to choose which car the 
 *  user wants cusotmize. Lastly, it shows how the program deals with collisions. 
 *  .
 * 
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class Canvas extends JPanel implements MouseListener{
    
    Model the_model;
    Timer timer;
    int mouse_location_x;
    int mouse_location_y;
    int chosen_vehicle;
    String the_state;

    double scale_factor = 1;
    

    
    public Canvas(){
        addMouseListener(this);
        the_model = new Model(); 
        

        Move_Buses_Listener mbListener = new Move_Buses_Listener();

        timer = new Timer(1000, mbListener);
        tick();

    }

    public void paintComponent (Graphics g) {
        drawGrid(g);
        the_model.draw(g);
    }
    
    public void drawGrid(Graphics g){
        double the_new_scale = 45 * scale_factor;
        int rounded_new_scale = (int)the_new_scale;
        for(int k = 0; k <= 450; k = k + rounded_new_scale){
            for(int i = 0; i <= 450; i = i + rounded_new_scale){
                g.drawRect(i,k, rounded_new_scale, rounded_new_scale);
            }  
        }
        
        
        
    }

    public class Move_Buses_Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){

           for(int i = 0; i < the_model.all_vehicles.size(); i++){
                the_model.all_vehicles.get(i).x_position = the_model.all_vehicles.get(i).x_position + the_model.all_vehicles.get(i).speed;
                the_model.all_vehicles.get(i).bus_width_end = the_model.all_vehicles.get(i).bus_width_end + the_model.all_vehicles.get(i).speed;
                if(the_model.all_vehicles.get(1).bus_width_end >= 450){
                    timer.stop();
                    the_state = "You win!!!";
                }
                for(int x = 0; x < the_model.all_vehicles.size(); x++){
                    if(i != x){
                        if(the_model.all_vehicles.get(i).y_position >= the_model.all_vehicles.get(x).y_position && the_model.all_vehicles.get(i).y_position <= the_model.all_vehicles.get(x).bus_height_end){
                           if((the_model.all_vehicles.get(i).x_position >= the_model.all_vehicles.get(x).x_position && the_model.all_vehicles.get(i).x_position <= the_model.all_vehicles.get(x).bus_width_end) || (the_model.all_vehicles.get(i).bus_width_end >= the_model.all_vehicles.get(x).x_position && the_model.all_vehicles.get(i).bus_width_end <= the_model.all_vehicles.get(x).bus_width_end)){
                                the_model.all_vehicles.get(i).speed = 1;
                                System.out.println("There was a collision!!!");
                            } 
                        }
                        
                    }
                    if(the_model.all_vehicles.get(i).bus_width_end >= 450 && the_model.all_vehicles.get(1).bus_width_end < 450){
                        timer.stop();
                        the_state = "You lose!";
                    }
                }
                
            }
           repaint();
        }
    }

    public void tick(){
        timer.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouse_location_x = e.getX();
        mouse_location_y = e.getY();

        boolean on_vehicle;
        

        for(int i = 0; i < the_model.all_vehicles.size(); i++){
            on_vehicle = the_model.all_vehicles.get(i).pick_correlation(mouse_location_x, mouse_location_y);
            
            if(on_vehicle){
                chosen_vehicle = i;
                break;
            }
            else{
                chosen_vehicle = -1;
            }
        }


    }
        

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
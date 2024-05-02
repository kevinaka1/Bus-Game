/*
 *  Shuttle_Window.java
 *  Kevin Aka
 *  12-20-23
 *
 *  CS 86 Homework 7
 * 
 *  This file tells the program to make the middle area of the screen the place
 *  where the buses are drawn and moves. And it tells program to divide the rest 
 *  of the screen into 4 sections. 3 of these sections will hold buttons that 
 *  control what happens in the middle area of the screen, while the top section
 *  will state if the user won or not at the end of the game.
 * 
 */

import java.awt.*;
import javax.swing.*;

public class Shuttle_Window extends JFrame {
    

    public Shuttle_Window(){
        Canvas shuttle_map = new Canvas();
		shuttle_map.setLayout(new FlowLayout());
		shuttle_map.setBorder(BorderFactory.createLineBorder(Color.RED));
		shuttle_map.setPreferredSize(new Dimension(450,450));
		add(shuttle_map, BorderLayout.CENTER);
		pack();

        //add control panels
		Control_Panel1 control_panel1 = new Control_Panel1(shuttle_map);
		control_panel1.setLayout(new FlowLayout());
		control_panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		control_panel1.setPreferredSize(new Dimension(250,250));
        add(control_panel1, BorderLayout.EAST);
		pack();

		Control_Panel2 control_panel2 = new Control_Panel2(shuttle_map);
		control_panel2.setLayout(new FlowLayout());
		control_panel2.setBorder(BorderFactory.createLineBorder(Color.black));
		control_panel2.setPreferredSize(new Dimension(250,250));
        add(control_panel2, BorderLayout.WEST);
		pack();

		Control_Panel3 control_panel3 = new Control_Panel3(shuttle_map);
		control_panel3.setLayout(new FlowLayout());
		control_panel3.setBorder(BorderFactory.createLineBorder(Color.black));
		control_panel3.setPreferredSize(new Dimension(200,200));
        add(control_panel3, BorderLayout.SOUTH);
		pack();

		Control_Panel4 control_panel4 = new Control_Panel4(shuttle_map);
		control_panel4.setLayout(new FlowLayout());
		control_panel4.setBorder(BorderFactory.createLineBorder(Color.black));
		control_panel4.setPreferredSize(new Dimension(200,200));
        add(control_panel4, BorderLayout.NORTH);
		pack();


    } 
}

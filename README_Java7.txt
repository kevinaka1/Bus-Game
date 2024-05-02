Write your name and email
    Name: Kevin Aka
    Email: kevin.aka@tufts.edu

Describe how to compile and run your program
    To compile:
        Type "javac Add_Vehicle_Button.java"
        Type "javac Main.java"
        Type "javac Bus.java"
        Type "javac Canvas.java"
        Type "javac Change_A_Vehicle_Speed_Button.java"
        Type "javac Change_Bus_Speed_Button.java"
        Type "javac Change_Color_Button.java"
        Type "javac Control_Panel1.java"
        Type "javac Control_Panel2.java"
        Type "javac Control_Panel3.java"
        Type "javac Control_Panel4.java"
        Type "javac Model.java"
        Type "javac Shuttle_Window.java"
        Type "javac Start_Buses_Button.java"
        Type "javac Start_Tufts_Shuttle_Tracker.java"
        Type "javac Stop_Buses_Button.java"
        Type "javac Vehicles.java"
        Type "javac Zoom_Button.java"
       
    To run:
        Type "java Main"

Describe what your program currently does.
    Currently my program creates a window for the tracker app. It also creates a Canvas in the middle.
    In the Canvas, there is a grid and two buses move. My program also creates 4 sections 
    surrounding the Canvas which are Control Panels. 3 of these control panels have buttons which control happens in the canvas. 
    There are start and stop buttons, which make the buses stop and start moving. There is a change speed button, 
    which changes how fast the buses are moving. There is also an add vehicle button which adds a new, 
    user-customized bus. There is a button that changes the color of a specific vehicle, and a button that
    changes the speed of a specific vehicle. There are also buttons that zoom the grid in and out. 
    The 4th control panel at the top is the state panel, which will tell you if you win or lose. 

Describe the rules of your simulation or game
    In order to win, the original blue bus must reach the near the end first.
    You can add a new bus wherever you want. You can change the color and speed
    of a bus by double tapping the bus you want. If another bus reaches the end first,
    you lose. You can zoom in and zoom out, and you can also change the speed of 
    all the buses if you'd like.

Describe all objects in your program alongside an inheritance and aggregation hierarchy.
    Inheritance
        No subclass
            Assignment7() object - starts the program
            
            Start_Tufts Shuttle Tracker() object - creates the window
            
            Vehicles object - needed to access the objects in the Vehicles array list
            
            Model object - creates and draws the vehicles and the stops by calling their respective draw methods. 

            Timer object - tells the program to move the buses every second 

            Move_Buses_Listener() object - holds the steps the program takes to move the buses

            Scanner() objects - helps the program to take in user input

            Stop_Bus_Button_Listener() object - monitors when the user click the stop bus button
            and stops the buses

            Start_Bus_Button_Listener() object - monitors when the user click the start bus button
            and starts the buses

            Change_Bus_Speed_Button_Listener() object - monitors when the user click the change bus speed button,
            asks the user for the new bus speed, and changes the bus speed of all buses

            Add_Vehicle_Button_Listener() object - monitors when the user clicks the add vehicle button,
            asks the user for info on this new vehicle, then creates the new bus

            Change_A_Vehicle_Speed_Button_Listener() object - monitors when the user clicks the change a vehicle
            speed button, make sure the user actually clicked a vehicle, and then asks the user for
            a the new speed

            Change_Color_Button_Listener() object - monitors when the user clicks the change color
            button, and makes sure the user actually clicked a vehicle and a color option

            Updates_Listener() object - holds the steps the program takes to check if the user
            has lost or won

            Zoom_In_Button_Listener() object - monitors when user clicks the zoom in button, and
            zooms in the grid by a factor of 2.

            Zoom_Out_Button_Listener() object - monitors when user clicks the zoom out button, and
            zooms out the grid by a factor of 2.

        JFrame Subclass
            Shuttle Window() object -  sets up the canvas and control panel

        JPanel Subclass
            Canvas() object - draws all of the vehicles and the stops(by calling model). It also 
            creates and places the label buttons thats on the panel

            Control_Panel1() object - creates and places the buttons thats on the control panel 1

            Control_Panel2() object - creates and places the buttons thats on the control panel 2

            Control_Panel3() object - creates and places buttons thats on the control panel 3

            Control_Panel4() object - creates the state panel

        JButton subclass

            Change_Bus_Speed_Button() object - creates the change bus speed button

            Add_Vehicle_Button() object - creates the add vehicle button

            Stop_Buses_Button() object - creates the stop bus button

            Start_Buses_Button() object - creates the start bus button
            
            Change_A_Vehicle_Speed_Button() object - creates the change a vehicle speed button

            Change_Color_Button() object - creates the change color button

            Zoom_Button() objects - creates the buttons that zoom in and out
        
        Vehicles Subclass
            Bus() object - holds information needed to draw the buses and draws the buses
          
    Aggregation
    Main() object contains
        Start_Tufts Shuttle Tracker() object contains
            Shuttle Window() object contains 
                Canvas() object contains
                    Model() object contains
                        Bus() object
                        Vehicles() object
                    Move_Buses_Listener() object
                Control_Panel1() object contains
                    Canvas() object
                    Add_Vehicle_Button() object
                    Add_Vehicle_Button_Listener () object
                    Zoom_Button() objects
                    Zoom_In_Button_Listener() object
                    Zoom_Out_Button_Listener() object
                Control_Panel2() object contains
                    Canvas() object
                    Start_Buses_Button object()
                    Stop_Buses_Button object()
                    Change_Bus_Speed_Button object()
                    Start_Buses_Button_Listener object()
                    Stop_Buses_Button_Listener object()
                    Change_Bus_Speed_Button_Listener object()
                Control_Panel3() object contains
                    Change_A_Vehicle_Speed_Button() object
                    Change_A_Vehicle_Speed_Button_Listener() object
                    Change_Color_Button() object
                    Change_Color_Button_Listener() object
                Control_Panel4() object contains
                    Canvas() object
                    Updates_Listener() object

Questions and Concerns with Assignment 7
    I'm not sure if I handeled the zooming in and out right. The assignment prompt said that zooming
    in and out will ess up our MousePicker and mine worked just fine.
                    
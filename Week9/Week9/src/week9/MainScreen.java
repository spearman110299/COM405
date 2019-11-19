/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 4pears91
 */
public class MainScreen extends JFrame implements ActionListener {
    private JLabel lblTitle;
    private JLabel lblMaxSpeed;
    private JLabel lblMaxFuel;
    private JLabel lblCurrentSpeed;
    private JLabel lblFuelLevel;
    
    private JLabel lblTitleOP;
    private JLabel lblMaxSpeedOP;
    private JLabel lblMaxFuelOP;
    private JLabel lblCurrentSpeedOP;
    private JLabel lblFuelLevelOP;
    
    private JButton btnAccelerate;
    private JButton btnBrake;
    private JButton btnRefuel;
    
    
    private GridBagConstraints constraints;
    private Car Cars; 
    
    
    public MainScreen()
    {
    Cars = new Car();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridBagLayout());
    constraints = new GridBagConstraints();
    initComponents();
    layoutComponents();
    }       
    
    
    public void initComponents()
    {
    lblTitle = new JLabel("Car");
    lblMaxSpeed = new JLabel("Max Speed:");
    lblMaxFuel = new JLabel("Max Fuel Level:");
    lblCurrentSpeed = new JLabel("Current Speed:");
    lblFuelLevel = new JLabel("Fuel Level:");
    
    lblMaxSpeedOP = new JLabel("The car can only go " + Cars.getMaxSpeed() + "mph");
    lblMaxFuelOP = new JLabel("Cars Max Fuel Level is " + Cars.getMaxFuel());
    lblCurrentSpeedOP = new JLabel("The car is going " + Cars.getCurrentSpeed() + "mph");
    lblFuelLevelOP = new JLabel("Current Fuel Level is " + Cars.getFuelLevel());
    
    btnAccelerate = new JButton("Accelerate");
    btnAccelerate.addActionListener(this);
    

    btnBrake = new JButton("Brake");
    btnBrake.addActionListener(this);
    
   
    
    btnRefuel = new JButton("Refuel");
    btnRefuel.addActionListener(this);
    
   
    }
    
    public void layoutComponents()
    {
        constraints.gridy = 0; 
        constraints.gridx = 0; 
        constraints.gridwidth = 3;
        
        this.add(lblTitle, constraints);
        
        constraints.gridy = 1; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblMaxSpeed, constraints);
        
        constraints.gridy = 1; 
        constraints.gridx = 1; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblMaxSpeedOP, constraints);
        
        constraints.gridy = 2; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblMaxFuel, constraints);
        
        constraints.gridy = 2; 
        constraints.gridx = 1; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblMaxFuelOP, constraints);
        
        constraints.gridy = 3; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblCurrentSpeed, constraints);
        
        constraints.gridy = 3; 
        constraints.gridx = 1; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblCurrentSpeedOP, constraints);
        
        constraints.gridy = 4; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblFuelLevel, constraints);
        
        constraints.gridy = 4; 
        constraints.gridx = 1; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblFuelLevelOP, constraints);
        
        constraints.gridy = 6;
        constraints.gridx = 0;
        this.add(btnAccelerate, constraints);
        
        constraints.gridy = 6;
        constraints.gridx = 1;
        this.add(btnBrake, constraints);
        
        constraints.gridy = 6;
        constraints.gridx = 2;
        this.add(btnRefuel, constraints);
        
        
    }
            
    @Override
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnAccelerate))
        {
            Cars.accelerate();
            lblCurrentSpeedOP.setText("The Car is going " + Cars.getCurrentSpeed() + "mph");
            lblFuelLevelOP.setText("Current Fuel Level is " + Cars.getFuelLevel());
        }
        else if(ev.getSource().equals(btnBrake))
        {
            Cars.brake();
            lblCurrentSpeedOP.setText("The Car is going " + Cars.getCurrentSpeed() + "mph");
            
            
        }
        else if(ev.getSource().equals(btnRefuel))
        {
            Cars.refuel();
            lblFuelLevelOP.setText("Current Fuel Level is " + Cars.getFuelLevel() );
        }
    }
            
            
            
            
            
            
            
            
            
}

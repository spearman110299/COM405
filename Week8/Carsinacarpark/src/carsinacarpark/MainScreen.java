/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsinacarpark;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author 4pears91
 */
public class MainScreen extends JFrame implements ActionListener {
    private JLabel lblTitle;
    private JLabel lblRegistrationNumber;
    private JLabel lblCarColor;
    private JLabel lblCarMake;
    private JLabel lblCarModel;
    private JLabel lblCarParkStatus;
    
    private JTextField txtTitle;
    private JTextField txtRegistrationNumber;
    private JTextField txtCarColor;
    private JTextField txtCarMake;
    private JTextField txtCarModel;
    
    private JButton btnAddCar;
    private JButton btnRemoveCar;
    
    private GridBagConstraints constraints;
    private CarPark ParkedCars;         
    
    
    public MainScreen()
{
    ParkedCars = new CarPark();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridBagLayout());
    constraints = new GridBagConstraints();
    initComponents();
    layoutComponents();
    

}
    
    public void initComponents()
{
    lblTitle = new JLabel("Car Park System");
    lblRegistrationNumber= new JLabel("Registration Number:");
    lblCarColor = new JLabel("Car Color:");
    lblCarMake = new JLabel("Car Make:");
    lblCarModel = new JLabel("Car Model:");
    lblCarParkStatus = new JLabel("Car Park has 15 empty spaces");
    txtRegistrationNumber = new JTextField();
    txtCarColor = new JTextField();
    txtCarMake = new JTextField();
    txtCarModel = new JTextField();
    
    btnAddCar = new JButton("Add Car");
    btnAddCar.addActionListener(this);

    btnRemoveCar = new JButton("Remove Car");
    btnRemoveCar.addActionListener(this);
}
    
    
    public void layoutComponents()
    {
        constraints.gridy = 0; 
        constraints.gridx = 0; 
        constraints.gridwidth = 2;
        
        this.add(lblTitle, constraints);
                      
        constraints.gridy = 1; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblRegistrationNumber, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 1;
        constraints.gridx = 1;
        this.add(txtRegistrationNumber, constraints);
        
        constraints.gridy = 2; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblCarColor, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 2;
        constraints.gridx = 1;
        this.add(txtCarColor, constraints);
        
        constraints.gridy = 3; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblCarMake, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 3;
        constraints.gridx = 1;
        this.add(txtCarMake, constraints);
        
        
        constraints.gridy = 4; 
        constraints.gridx = 0; 
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblCarModel, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 4;
        constraints.gridx = 1;
        this.add(txtCarModel, constraints);
        
        constraints.gridy = 5; 
        constraints.gridx = 0; 
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblCarParkStatus, constraints);
        
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 6;
        constraints.gridx = 0;
        this.add(btnAddCar, constraints);
        
       
       
        constraints.gridx = 1;
        this.add(btnRemoveCar, constraints);

        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnAddCar))
        {
            String regnumber = txtRegistrationNumber.getText();
            String color = txtCarColor.getText();
            String make = txtCarMake.getText();
            String model = txtCarModel.getText();
                if(ParkedCars.addCar(new Car(regnumber,color,make,model)))
                {
                    JOptionPane.showMessageDialog(null, "Car has been added");
                }
                else
			{
				JOptionPane.showMessageDialog(null, "The Car Park is full");
                                lblCarParkStatus.setText("Car Park has " + ParkedCars.calcEmptySpaces() + "empty spaces");
			}
        }
                else if(ev.getSource().equals(btnRemoveCar))
		{
			 String regnumber = txtRegistrationNumber.getText();
                            if(ParkedCars.removeCar(regnumber))
                            {
                                  JOptionPane.showMessageDialog(null, "Car has been Removed");
                                  lblCarParkStatus.setText("Car Park has " + ParkedCars.calcEmptySpaces() + "empty spaces");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Car not found");
                            }
		}
    }
    }



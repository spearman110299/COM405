/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 4pears91
 */
public class Admin extends Employee {
    private Manager assignedmanager;
    
    public Admin(String nameIn, int payrateIn, int reqhoursIn, int entholidaysIn)
    {
        super(nameIn, payrateIn, reqhoursIn, entholidaysIn);
    }
    
    
    public Manager getManager()
    {
        return assignedmanager;
    }
    public void setManager(Manager managerIn)
    {
        assignedmanager = managerIn;
    }
    
    @Override
    public String getDetails()
    {
      String ret = super.getDetails();
      if(assignedmanager != null)
      {
          ret += assignedmanager.getName();
      }
    
    else
    {
        ret += " No manager";
    }
      return ret;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author shahe
 */
class Employees {
    private String ID;
    private String Name,Designation, Address,Telephone,Email,Fax;

    public Employees(String ID,String Name,String Designation,String Address,String Telephone,String Email,String Fax)
{
    this.ID=ID;
    this.Name=Name;
    this.Designation=Designation;
    this.Address=Address;
    this.Telephone=Telephone;
    this.Email=Email;
    this.Fax=Fax;
}
    public String getID(){
    return ID;
    }
    public String getName(){
    return Name;
    }
    public String getDesignation(){
    return Designation;
    }
    public String getAddress(){
    return Address;
    }
    public String getTelephone(){
    return Telephone;
    }public String getEmail(){
    return Email;
    }
    public String getFax(){
    return Fax;
    }
    
    
}

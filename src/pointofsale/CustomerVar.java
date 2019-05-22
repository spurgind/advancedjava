/*
 * CTUOnline Educational Use Only
 */

package pointofsale;

/**
 *Dalton Spurgin 
 */


public class CustomerVar {
                 

        int customerID;
        String firstName;
        String lastName;
        String addressStreet;
        String addressCity;
        String addressState;
        int addressZip;

//establish getters and setters to call methods in other classes
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public int getCustomerID() {
        return customerID;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setAddressStreet(String addressStreet){
        this.addressStreet = addressStreet;
    } 
    public String getAddressStreet() {
        return addressStreet;
    }
    
    public void setAddressCity(String addressCity){
        this.addressCity = addressCity;
    }     
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressState(String addressState){
        this.addressCity = addressState;    
    }
    public String getAddressState() {
        return addressState;
    }
    
    public void setAddressZip(int addressZip){
        this.addressZip = addressZip;    
    }    
    public int getAddressZip() {
        return addressZip;
    }    

}







package model;

public class Customers {
    
    private int customerID;
    private String firstName;
    private String lastName;
    private String addr1;
    private String city;
    private String stateAbr;
    private int zip;
    private String emailAddr;

    
    
    
    public Customers() {
        this.customerID = 0;
        this.firstName = "";
        this.lastName = "";
        this.addr1 = "";
        this.city = "";
        this.stateAbr = "";
        this.zip = 0;
        this.emailAddr = "";
    }
    
    public Customers(int customerID, String firstName, String lastName, String addr1, String city, String stateAbr, int zip, String emailAddr) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr1 = addr1;
        this.city = city;
        this.stateAbr = stateAbr;
        this.zip = zip;
        this.emailAddr = emailAddr;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateAbr() {
        return stateAbr;
    }

    public void setStateAbr(String stateAbr) {
        this.stateAbr = stateAbr;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", addr1=" + addr1 + ", city=" + city + ", stateAbr=" + stateAbr + ", zip=" + zip + ", emailAddr=" + emailAddr + '}';
    }
    
    
    
  
    }

    
    
    
    


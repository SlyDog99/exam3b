
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class ReadQuery {
    
   private Connection conn;
   private ResultSet results;
   
   
     public ReadQuery(){
         
      Properties props = new Properties(); //MWC
      InputStream instr = getClass().getResourceAsStream("dbConn.properties");
       try {
           props.load(instr);
       } catch (IOException ex) {
           Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           instr.close();
       } catch (IOException ex) {
           Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      String driver = props.getProperty("driver.name");
      String url = props.getProperty("server.name");
      String username = props.getProperty("user.name");        
      String passwd = props.getProperty("user.password");
       try {
           Class.forName(driver);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           conn = DriverManager.getConnection(url, username, passwd);
       } catch (SQLException ex) {
           Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
         
     }
    
     public void doRead(){
         
       try {
           String query = "Select * from customers";
           
           PreparedStatement ps = conn.prepareStatement (query);
           this.results = ps.executeQuery();
       } catch (SQLException ex) {
           Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
         
     }
     
      public String getHTMLtable(){
         
     String table = "";
     table +="<table border=1>";
          
       try {
           while(this.results.next()){
               
               Customers customer = new Customers();
               customer.setCustomerID(this.results.getInt("customerID"));
               customer.setFirstName(this.results.getString("firstName"));
               customer.setLastName(this.results.getString("lastName"));
               customer.setAddr1(this.results.getString("addr1"));
               customer.setCity(this.results.getString("city"));
               customer.setZip(this.results.getInt("zip"));
               customer.setEmailAddr(this.results.getString("emailAddr"));
               
               table+= "<tr>";
               table+= "<td>";
               table += customer.getCustomerID();
               table+= "</td>";
               
               table+= "<td>";
               table += customer.getFirstName();
               table+= "</td>";
               
               table+= "<td>";
               table += customer.getLastName();
               table+= "</td>";
               
               table+= "<td>";
               table += customer.getAddr1();
               table+= "</td>";
               
               table+= "<td>";
               table+= customer.getCity();
               table+= "</td>";
               
               table+= "<td>";
               table += customer.getZip();
               table+= "</td>";
               
               table+= "<td>";
               table += customer.getEmailAddr();
               table+= "</td>";
               
               table+= "<td>";
              table +="<a href=update?customerID="+ customer.getCustomerID() + "> Update </a>" + "<a href= delete?customerID=" + customer.getCustomerID() + "> Delete </a>";
               table+= "</td>";
               table+= "</tr>";
               
           } } catch (SQLException ex) {
           Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
     
      table +="</table>";
     
            return table;
      }
     
     
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.Clock;
import java.time.ZoneId;



/**
 *
 * @author khifayatabolurin
 */
public class MysqlTest {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
    }catch (ClassNotFoundException e){
        System.out.println(e);
    	}
    }
    final String ID = "kabolu1";
    final String PW = "Cosc*fern";
    final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/kabolu1db";
   
    
    public void readDataBase() {
	    getStaff(ID, PW, SERVER);
	    System.out.println();
	    getClients(ID, PW, SERVER);
	    System.out.println();
	    getCaseMgr(ID, PW, SERVER);
	    System.out.println();
	    getFullCode(ID, PW, SERVER);
	    System.out.println();
	    getDNR(ID, PW, SERVER);
	    System.out.println();
	    getNurses(ID, PW, SERVER);
	    System.out.println();
	    getAides(ID, PW, SERVER);
	    System.out.println();
	    getNursingAssistants(ID, PW, SERVER);
	    System.out.println();
	    getGardianContact(ID, PW, SERVER);
	   }
    
    public static void getStaff (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM kabolu1db.Staff");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Staff: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            System.out.println(fName  + " " + lName);
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    public static void getClients (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM kabolu1db.Client");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Clients: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            System.out.println(fName  + " " + lName);
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    public static void getCaseMgr (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM kabolu1db.CaseMgr");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Case Managers: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            System.out.println(fName  + " " + lName);
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    public static void getFullCode (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
       // querys = "SELECT fName, lName FROM kaboludb.Client  WHERE molst = 'FC' ";
        ResultSet rs = stmt.executeQuery("SELECT fName, lName, molst FROM kabolu1db.Client WHERE molst = 'FC'; ");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Full Code Clients: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            String molst = rs.getString("molst");
            System.out.println(fName + " " + lName );
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    public static void getDNR (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
       // querys = "SELECT fName, lName FROM kaboludb.Client  WHERE molst = 'FC' ";
        ResultSet rs = stmt.executeQuery("SELECT fName, lName, molst FROM kabolu1db.Client WHERE molst = 'DNR'; ");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris DNR Clients: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            String molst = rs.getString("molst");
            System.out.println(fName + " " + lName );
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    public static void getNurses (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
       // querys = "SELECT fName, lName FROM kaboludb.Client  WHERE molst = 'FC' ";
        ResultSet rs = stmt.executeQuery("SELECT fName, lName FROM kabolu1db.Staff WHERE type = 'Nurse'; ");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Nurses: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            System.out.println(fName + " " + lName );
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    public static void getAides (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
       // querys = "SELECT fName, lName FROM kaboludb.Client  WHERE molst = 'FC' ";
        ResultSet rs = stmt.executeQuery("SELECT fName, lName FROM kabolu1db.Staff WHERE type = 'Aide'; ");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Aides: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            System.out.println(fName + " " + lName );
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    public static void getNursingAssistants (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
       // querys = "SELECT fName, lName FROM kaboludb.Client  WHERE molst = 'FC' ";
        ResultSet rs = stmt.executeQuery("SELECT fName, lName FROM kabolu1db.Staff WHERE type = 'NA'; ");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Nursing Assisntants: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            System.out.println(fName + " " + lName );
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    
    public static void getGardianContact (String ID, String PW, String SERVER){
         String querys;
         
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
       // querys = "SELECT fName, lName FROM kaboludb.Client  WHERE molst = 'FC' ";
        ResultSet rs = stmt.executeQuery("SELECT fName, lName, phoneNum FROM kabolu1db.Gaurdian; ");
        PreparedStatement updateStaff = null;
        
        
        System.out.println("Kadris Gardian contact info: " ); 
        while (rs.next()){
            String fName = rs.getString("fName");
            String lName = rs.getString("lName");
            String phoneNum = rs.getString("phoneNum");
            System.out.println(fName + " " + lName + ": " + phoneNum );
            
        }
//        querys = "UPDATE shongdb.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
//        updateStaff = con.prepareStatement(querys);
//        updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }

    }
    
    
}

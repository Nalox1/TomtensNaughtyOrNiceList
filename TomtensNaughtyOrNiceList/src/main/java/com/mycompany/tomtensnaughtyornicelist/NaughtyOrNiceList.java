package com.mycompany.tomtensnaughtyornicelist;

import java.awt.List;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



public class NaughtyOrNiceList {
    
    public static void main(String[] args) {
        
        try{
         //   Class.forName("com.mysql.jdbc.Driver");
            connectToAndQueryDatabase("root", "Hinsaringen39");
        }
        catch(Exception p){
            p.printStackTrace();
            System.out.println("Some thing whent wrong!");
        }
        
        
    }
    
    
    public static void connectToAndQueryDatabase(String username, String password){
        ArrayList<String> mylist = new ArrayList<String>();
        int x = 0;
        String s = null;
        boolean b = true;
        Scanner input = new Scanner(System.in);
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomtedatabasedemoiot?serverTimezone=UTC", "root", "Hinsaringen39");){
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name, nice FROM child");
            
            
            
            System.out.print("Choose an name: ");
            String person = input.nextLine().trim();
            System.out.println("You have choosen " + person);
            
            while (rs.next()){
                s = rs.getString("name");
                b = rs.getBoolean("nice");
                x = rs.getInt("id");
                
                mylist.add(s + " " +b);
            }
            
           
            
            System.out.println("before for "+mylist.size());
           
            for(int i = 0; i < mylist.size(); i++){
                String tempname = mylist.get(i);
//                System.out.println("tempname "+tempname);
//                System.out.println("person "+person);
                
                if(tempname.equalsIgnoreCase(person)){
                    
                    System.out.println(person + b);
                }
//                else{
//                    System.out.println("I found nothing!");
//                }
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//            for(int l = 0; l < mylist.size(); l++){
//                String temp = mylist.get(l);
//                
//                
//                
//                   if(temp.equalsIgnoreCase(person)){
//                    System.out.print(person + " ");
//                    if(temp.contains("true")){
//                        System.out.print("Snäll");
//                    }
//                    else if(temp.contains("false")){
//                        System.out.print("Elak");
//                    }
//                    else{
//                        System.out.println("Temp dont contains anything");
//                    }
//                    } 
//                
//                
//                
//            }
            
            
          
//            System.out.println("before for "+mylist.size());
//           
//            for(int i = 0; i < mylist.size(); i++){
//                String tempname = mylist.get(i);
//                System.out.println("tempname "+tempname);
//                System.out.println("person "+person);
//                
//                if(tempname.equalsIgnoreCase(person)){
//                    
//                    System.out.println(person);
//                }
//                else{
//                    System.out.println("I found nothing!");
//                }
//            }
            
          
            
                       
            
         
                
             
        }
         catch(Exception e){
             e.printStackTrace();
            System.out.println("Cant Connect SomeThing Whent Wrong");
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask;

import java.util.Scanner;

/**
 *
 * @author Liyanda Gift
 */
public class ICETASK {

    public static void main(String[] args) {
  Student[] arrayofStudents = new Student [1];
  Scanner scanner = new Scanner(System.in);
  scanner.useDelimiter(";");
  
  System.out.println("*********************************");
   System.out.println("Capture Student Data in the following format:");
    System.out.println("ID; Name;Surname;Username;Password;");
     System.out.println("Take note of the trailing semi-colon;");
    System.out.println("***********************************************\n");
    
    // loop to input student data
    for(int i =0; i< arrayofStudents.length;i++){
    
    System.out.println("Enter data for Student" + (i+1)+":");
    int ID = scanner.nextInt();
    String name = scanner.next();
    String surname = scanner.next();
    String username = scanner.next();
    String password = scanner.next();
    
    // create and sore the student onject
    
    arrayofStudents[i] = new Student(ID, name, surname, username, password);
    
    System.out.println("\nstudent Data Captured Successfully!\n");
    
    
    }
    scanner.close();
    // Display all student data
    
    System.out.println("******* All Student Data *******\n");
    for (int i =0; i< arrayofStudents.length; i++){
    
    Student s = arrayofStudents[i];
    System.out.println("Student" + (i+1)+":");
    System.out.println("ID:"+ s.getID());
    System.out.println("Name:"+ s.getName());
    System.out.println("Surname:"+ s.getSurname());
    System.out.println("Username:"+ s.getUsername());
    System.out.println("Password:"+ s.getPassword());
    }
    
    
    
    
    
    
    
    
    
    }
}

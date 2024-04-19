/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;
// Filename Account.java
// Written by <Luzuko Daki>
// Written on < 17/4/24 - 19/4/24 >
import javax.swing.JOptionPane;
/**
 *
 * @author Daki
 */
public class Login {
    //declaring variables
    private String userName;
    private String passWord;
    private String name;
    private String lastName;
    private boolean underScore;
    
    // This method ensures that any username contains an under score (_) and is no more than
    public Login (){
        userName = "_Daki";
        passWord = "Luzukodaki1*";
    }
    public boolean checkUserName(){
       // This method ensures that any username contains an under score (_) and is no more than 5 characters long
        underScore=userName.contains("_");
        // using if statements to creat condition
        if(userName.length()<5 && underScore==true){ 
           return true;
            
        }else{
          return false;  
        } 
       
    }
    public boolean checkPasswordComplexity(){
        // This method ensures that passwords meet the following password complexity rules
        // initializing variables
        boolean minimumPassWordLength = (passWord.length()>=8);
        boolean containsCapitalLetter = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;
        // Declared and initialized variable for special characters
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";

        char[] passWordChars  = passWord.toCharArray();
        for(int i = 0; i >= passWord.length(); i++){
            if(Character.isUpperCase(passWordChars[i])){
                containsCapitalLetter = true;
                continue;                                                                 
            }
           if(Character.isDigit(passWordChars[i])){
               containsNumber = true;
               continue;
               
           }
           if(specialChars.contains(passWord)){
               containsSpecialCharacter = true;
               
           }
        }
        if(minimumPassWordLength && containsCapitalLetter && containsNumber && containsSpecialCharacter){
            return true;
            
        }
        return false;    
    }
    // This method returns the necessary registration messaging indicating if:
    // 1 The username is incorrectly formatted
    // 2 The password does not meet the complexity requirements.
    // 3 The two above conditions have been met and the user has been registered successfully.
    public String registerUser(){   
        boolean isValidUserName = checkUserName();
        boolean isValidPassWord = checkPasswordComplexity();
       
   
        if(!isValidPassWord){
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        if(!isValidUserName){
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ";
        }
        return  "Username and Password have been successfully captured"; 
    
        
    }
    // using method that verifies that the login details entered matches the login details stored when the user registers.
    public boolean loginUser(String loginUserName, String loginPassWord){
    
        if(loginUserName == userName || loginPassWord == passWord ){
          return false;
        }
          return true;
         
   }
    
    public class returnLoginStatus {
        public String returnLoginStatus(boolean isSuccess){
            if(isSuccess){
                return "Welcome <user first name> ,<user last name> it is great to see you again";
            } else { return "Username or password incorrect, please try again";
        }
        }       
    }
        //boolean isuserLogin;
       // boolean ispassLogin;
        
      // if(isuserLogin = userName && ispassLogin = passWord){
         //  return "Welcome <user first name> ,<user last name> it is great to see you again";
    //   } 
   // }
    
}

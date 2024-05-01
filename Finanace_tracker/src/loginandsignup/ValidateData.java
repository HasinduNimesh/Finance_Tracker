package loginandsignup;

import java.util.regex.*;

public class ValidateData {
    
    public static String validateEmail(javax.swing.JTextField email){
        if(email==null || email.getText().isEmpty()){
            return "Invalid";
        }
        
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email.getText()).matches()){
            return "Valid";
        }else{
            return "Invalid";
        }
    }
    
    public static String validateNames(javax.swing.JTextField name){
        if(name==null || name.getText().isEmpty()){
            return "Invalid";
        }
        
        String nameRegex = "^[A-Za-z]+$";
        
        Pattern pattern = Pattern.compile(nameRegex);
        if(pattern.matcher(name.getText()).matches()){
            return "Valid";
        }else{
            return "Invalid";
        }
        
    }
    
    public static String validatePassword(javax.swing.JPasswordField password){
        if(password==null || password.getText().isEmpty()){
            return "Invalid";
        }
        
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        
        Pattern pattern = Pattern.compile(passwordRegex);
        if(pattern.matcher(password.getText()).matches()){
            return "Valid";
        }else{
            return "Invalid";
        }
        
    }
    
}

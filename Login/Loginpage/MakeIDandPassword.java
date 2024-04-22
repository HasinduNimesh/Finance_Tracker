import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import javax.swing.JOptionPane;

class MakeIDandPassword {

private String username,newPassword;
private HashMap<String,String> loginInfo = new HashMap<String,String>();



protected int createUserAccount(String firstName, String lastName, String password,IDandPasswords iDandPasswords) throws IOException {
        loginInfo=iDandPasswords.getLoginInfo();
        String username = firstName.toLowerCase() + lastName.toLowerCase();
        
         if (loginInfo != null && loginInfo.containsKey(username)) {
            JOptionPane.showMessageDialog(null, "Username Already taken !", "Registration error" , JOptionPane.ERROR_MESSAGE);
            return -1;
            } 
         else{
            iDandPasswords.newUser(username, password);
            JOptionPane.showMessageDialog(null,"Your user name is: "+username,"Registered" ,JOptionPane.INFORMATION_MESSAGE);

            // serialization
            FileOutputStream fileOut=new FileOutputStream("userPassword.ser");
            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(iDandPasswords);
            out.close();
            fileOut.close();

            System.out.println("Object info saved!!");

            return 1;
        }
    }
}

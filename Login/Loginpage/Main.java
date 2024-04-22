import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/* This will not run as we already pre-install the userPassword.ser
		//Serializing
		IDandPasswords idandPasswords = new IDandPasswords(); 
		
		FileOutputStream fileOut=new FileOutputStream("userPassword.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(idandPasswords);
        out.close();
        fileOut.close();

        System.out.println("Object info saved!!");
		*/

		//deserialization
	
		IDandPasswords idandPasswords = null;
		FileInputStream fileIn=new FileInputStream("Login\\Loginpage\\userPassword.ser");
        ObjectInputStream in=new ObjectInputStream(fileIn);
        idandPasswords=(IDandPasswords)in.readObject();
        in.close();
        fileIn.close();
		//testing
		//idandPasswords.newUser("asdasbaba", "Nasdasd234");
		//MakeIDandPassword newUser= new MakeIDandPassword();
		//newUser.createUserAccount("Amhiiia","Wasnna","StrongPass123",idandPasswords);

		
		// serialization
		FileOutputStream fileOut=new FileOutputStream("userPassword.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(idandPasswords);
        out.close();
        fileOut.close();


        System.out.println("Object info saved!!");

		
				
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());


	}


	
}
//**************************************************

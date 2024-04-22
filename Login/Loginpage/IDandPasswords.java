import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class IDandPasswords implements Serializable {

	private HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){

		
		// Admin passwords
		logininfo.put("Admin1", "StrongPassword123"); //make this string cipher too
		logininfo.put("Admin2", "SecurePass789");
		logininfo.put("Admin3", "Admin@2024");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	protected void newUser(String name,String password){
		logininfo.put(name, password);
	}

	
}

import java.util.ArrayList;





public class Admin extends User{

    public Admin(String user_name, String password) {
        
        super(user_name,password);
    } 

  
   
    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public String getUser_name() {
        return super.getUser_name(); 
    }

    @Override
    public boolean login(String user_name, String password) {
        return user_name.equals("tuba") && password.equals("1234");
    }

    @Override
    public boolean login_comp(String user_name, String pasword, int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int indexOfElement(ArrayList<String> array, String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

}
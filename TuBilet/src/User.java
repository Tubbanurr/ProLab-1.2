
public abstract class User implements ILoginable{
    
    String user_name;
    String password;
   

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }
    


    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    
}

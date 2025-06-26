import java.util.ArrayList;

public class Company extends User implements IProfitable{

    static public ArrayList<String> firma = new ArrayList();
    static public ArrayList<String> sifre = new ArrayList();
    static public ArrayList<String> uye_ad = new ArrayList();
    
    
    static {
       firma.add("A");
       firma.add("B");
       firma.add("C");
       firma.add("D");
       firma.add("F");
        
    }
    static {
        uye_ad.add("Mirac Ol");
        uye_ad.add("Yunus Aksin");
        uye_ad.add("Yasemin Cinar");
        uye_ad.add("Alp Korkut");
        uye_ad.add("Betul Donmez");
        
        
    }
    static{
        sifre.add("11");
        sifre.add("22");
        sifre.add("33");
        sifre.add("44");
        sifre.add("55");
    }
   
    public Company(String user_name, String password) {
        super(user_name, password);
    }

    

    @Override
    public boolean login_comp(String user_name, String pasword, int i) {
        return  user_name.equals(uye_ad.get(i)) && password.equals(sifre.get(i));
    }

    @Override
    public boolean login(String user_name, String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int indexOfElement(ArrayList<String> array, String text) {
        for (int i = 0; i < array.size() ; i++) {
            if (array.get(i).equals(text)) 
                return i;
        }
        return -1; 
    }
}
    
import java.util.ArrayList;

abstract class Vehicle {
   
    static ArrayList<Object> araclar = new ArrayList();
    
    int arac_no;
    int koltuk_sayisi;
    int sefer_no;
        
    
       
    
        public Vehicle(int arac_no, int koltuk_sayisi, int sefer_no) {
        this.arac_no = arac_no;
        this.koltuk_sayisi = koltuk_sayisi;
        this.sefer_no = sefer_no;
    }
    static{
        Bus A = new Bus(1,20,3);
        Bus A2 = new Bus(2, 15, 3);
        Bus B = new Bus(1, 15, 3);
        Bus B2 = new Bus(2, 20, 4);
        Bus C = new Bus(1, 20, 4);
        Airplane C2 = new Airplane(1, 30, 5);
        Airplane C3 = new Airplane(2, 30, 5);
        Train D = new Train(1,25,1);
        Train D2 = new Train(2,25,2);
        Train D3 = new Train(3,25,2);
        Airplane F = new Airplane(1, 30, 6 );
        Airplane F2 = new Airplane(2, 30, 6 );
        
        araclar.add(A); 
        araclar.add(A2);
        araclar.add(B);
        araclar.add(B2);
        araclar.add(C);
        araclar.add(C2);
        araclar.add(C3);
        araclar.add(D);
        araclar.add(D2);
        araclar.add(D3);
        araclar.add(F);
        araclar.add(F2);
        
        
        
    }
   
}


public class Airplane extends Vehicle {

    public Airplane(int arac_no, int koltuk_sayisi, int sefer_no) {
        super(arac_no, koltuk_sayisi, sefer_no);
    }
    
    public int getArac_no() {
        return arac_no;
    }

    public void setArac_no(int arac_no) {
        this.arac_no = arac_no;
    }

    public int getKoltuk_sayisi() {
        return koltuk_sayisi;
    }

    public void setKoltuk_sayisi(int koltuk_sayisi) {
        this.koltuk_sayisi = koltuk_sayisi;
    }

    public int getSefer_no() {
        return sefer_no;
    }

    public void setSefer_no(int sefer_no) {
        this.sefer_no = sefer_no;
    }
    
    
}

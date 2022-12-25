public class HouseData {            //Ana class
    private  String odaSayisi;
    private  String konum;
    private  String isitma;
    private double fiyat;
    public HouseData(){             //Constructor method
    }
    public HouseData(String odaSayisi, String konum, String isitma, double fiyat) {     //Overload method
        this.odaSayisi = odaSayisi;
        this.konum = konum;
        this.isitma = isitma;
        this.fiyat = fiyat;
    }
    public String getOdaSayisi() {
        return odaSayisi;
    }
    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
    public String getKonum() {
        return konum;
    }
    public void setKonum(String konum) {
        this.konum = konum;
    }
    public String getIsitma() {
        return isitma;
    }
    public void setIsitma(String isitma) {
        this.isitma = isitma;
    }
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
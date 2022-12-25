import java.util.ArrayList;

public class Rent extends HouseControl implements ISaleOrRent {
    ArrayList<HouseData> forRent= new ArrayList<HouseData>();       //kiralik kategorisindeki evlerin tutuldugu array
    @Override
    public void process1() {                                        //ozellikle evOlustur methodunda homes arrayine eklenen evleri forRent arrayine de eklenmesini saglar
        for(int i=0; i<homes.size();i++){
            forRent.add(homes.get(i));
        }
    }
    @Override
    public void process2() {                                        //geri kalan methodlarda yapilan islemler
        for(int i=0; i<forRent.size();i++){
            homes.add(forRent.get(i));
        }
    }

}
import java.util.ArrayList;

public class Sale extends HouseControl implements ISaleOrRent{
    ArrayList<HouseData> forSale= new ArrayList<HouseData>();       //satilik kategorisindeki evlerin tutuldugu array
    @Override
    public void process1() {
        for(int i=0; i<homes.size();i++){                           //ozellikle evOlustur methodunda homes arrayine eklenen evleri forSale arrayine de eklenmesini saglar
            forSale.add(homes.get(i));
        }
    }
    @Override
    public void process2() {                                        //geri kalan methodlarda yapilan islemler
        for(int i=0; i<forSale.size();i++){
            homes.add(forSale.get(i));
        }
    }

}

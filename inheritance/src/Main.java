
//inheritance Adalah hubungan is-a

public class Main {
    public static void main(String[] args){
        Mobil mobil1= new Mobil();
        mobil1.mobil = "Bus";
        mobil1.display();

        Mobilitellligent mobil2 =new Mobilitellligent();
        mobil2.mobil ="TRUCK";
        mobil2.display();

        Mobilitellligent mobil3 =new Mobilitellligent();
        mobil3.mobil = "PRIBADI";
        mobil3.display();
    }

}
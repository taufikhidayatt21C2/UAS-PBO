public class Pohon {

    String nama;
    Daun daun1;
    public Pohon(String n, int jmlhtinggi){
        nama=n;
        daun1 = new Daun(jmlhtinggi);
    }

    public void tampilPohon(){
        System.out.println("Pohon = " + nama);
        System.out.println("jumlah lebar Daun.....cm...." +daun1.getjmllbarDaun());
    }
}

public class Lingkaran {

    private float jari;
    private  Titik Titikpusat;

    Lingkaran(Titik O, float Q) {

        jari = Q;
        Titikpusat = O;
    }

        public void cetakLingkaran(){

            System.out.println("letak Titik");
        Titikpusat.letakTitik();
        System.out.println("jari-jari :" + jari+"\n");
    }
}

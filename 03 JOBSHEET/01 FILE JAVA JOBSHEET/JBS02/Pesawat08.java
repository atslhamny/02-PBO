public class Pesawat08 {

    public String maskapai;
    public String kapasitasPenumpang;
    public int kecepatan;

    public int TambahKecepatan(int increment, int kecepatan){
         kecepatan += increment;
         return kecepatan;
    }

    public int KurangiKecepatan(int decrement, int kecepatan){
         kecepatan -= decrement;
         return kecepatan;
    }

    public void displayInfo(){
        System.out.println("Masakapai : " + maskapai);
        System.out.println("Kapasitas Penumpang : " + kapasitasPenumpang);
        System.out.println("Kecepatan Awal  : " + kecepatan);
        System.out.println("Kecepatan Di Udara : " + TambahKecepatan(kecepatan, 500) + "KM/JAM");
        System.out.println("Kecepatan saat landing : " + KurangiKecepatan(kecepatan, kecepatan) + "KM/JAM");
    }
}
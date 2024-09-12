public class PesawatDemo08 {
    public static void main(String[] args) {
        Pesawat08 pswt1 = new Pesawat08();
        pswt1.maskapai = "Garuda";
        pswt1.kapasitasPenumpang = "100";
        pswt1.kecepatan = 1000;

        Pesawat08 pswt2 = new Pesawat08();
        pswt2.maskapai = "Citylink";
        pswt2.kapasitasPenumpang = "60";
        pswt2.kecepatan = 500;

        pswt1.displayInfo();
        System.out.println("==============================");
        pswt2.displayInfo();
        System.out.println("==============================");

    }
}

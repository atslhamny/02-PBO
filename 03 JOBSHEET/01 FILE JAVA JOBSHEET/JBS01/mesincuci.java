/**
 * perpustakaan
 */
public class mesincuci {

    public static void main(String[] args) {
        
        String merk, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10;
        String jenis, jenis2, jenis3, jenis4, jenis5, jenis6, jenis7, jenis8, jenis9, jenis10;
        String nomor_seri, nomor_seri2, nomor_seri3, nomor_seri4, nomor_seri5, nomor_seri6, nomor_seri7, nomor_seri8, nomor_seri9, nomor_seri10;
        int kapasitas, kapasitas2, kapasitas3, kapasitas4, kapasitas5, kapasitas6, kapasitas7, kapasitas8, kapasitas9, kapasitas10;

        merk = "sharp";
        jenis = "manual";
        nomor_seri = "SHP001";
        kapasitas = 7;

        merk2 = "LG";
        jenis2 = "manual";
        nomor_seri2 = "LG001";
        kapasitas2 = 6;

        merk3 = "Samsung";
        jenis3 = "matic";
        nomor_seri3 = "SMS003";
        kapasitas3 = 8;

        merk4 = "Polytron";
        jenis4 = "matic";
        nomor_seri4 = "PLY004";
        kapasitas4 = 6;

        merk5 = "Sanken";
        jenis5 = "manual";
        nomor_seri5 = "SNK004";
        kapasitas5 = 9;

        merk6 = "Panasonic";
        jenis6 = "matic";
        nomor_seri6 = "PNS004";
        kapasitas6 = 5;

        merk7 = "Electrolux";
        jenis7 = "manual";
        nomor_seri7 = "ELC004";
        kapasitas7 = 9;

        merk8 = "Hitachi";
        jenis8 = "matic";
        nomor_seri8 = "HTC004";
        kapasitas8 = 4;

        merk9 = "Toshiba";
        jenis9 = "manual";
        nomor_seri9 = "TSB004";
        kapasitas9 = 7;

        merk10 = "Midea";
        jenis10 = "manual";
        nomor_seri10 = "MDA004";
        kapasitas10 = 5;

        kapasitas = TambahKapasitas(kapasitas, 2);
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas: " + kapasitas);

        kapasitas2 = KurangiKapasitas(kapasitas2, 3);
        System.out.println("Merk: " + merk2);
        System.out.println("Kapasitas: " + kapasitas2);

        kapasitas3 = TambahKapasitas(kapasitas3,4);
        System.out.println("Merk: " + merk3);
        System.out.println("Kapasitas: " + kapasitas3);

        kapasitas4 = KurangiKapasitas(kapasitas4, 1);
        System.out.println("Merk: " + merk4);
        System.out.println("Kapasitas: " + kapasitas4);

        kapasitas5 = TambahKapasitas(kapasitas5, 3);
        System.out.println("Merk: " + merk5);
        System.out.println("Kapasitas: " + kapasitas5); 

        kapasitas6 = TambahKapasitas(kapasitas6, 3);
        System.out.println("Merk: " + merk6);
        System.out.println("Kapasitas: " + kapasitas6);

        kapasitas7 = TambahKapasitas(kapasitas7, 2);
        System.out.println("Merk: " + merk7);
        System.out.println("Kapasitas: " + kapasitas7);

        kapasitas8 = TambahKapasitas(kapasitas8, 1);
        System.out.println("Merk: " + merk8);
        System.out.println("Kapasitas: " + kapasitas8);

        kapasitas9 = TambahKapasitas(kapasitas9, 2);
        System.out.println("Merk: " + merk9);
        System.out.println("Kapasitas: " + kapasitas9);

        kapasitas10 = TambahKapasitas(kapasitas10, 3);
        System.out.println("Merk: " + merk10);
        System.out.println("Kapasitas: " + kapasitas10);

    }

    public static int TambahKapasitas(int kapasitas, int angka1){
        kapasitas += angka1;

        return kapasitas;
    }

    public static int KurangiKapasitas(int kapasitas, int angka2){
        kapasitas -= angka2;

        return kapasitas;
    }
}
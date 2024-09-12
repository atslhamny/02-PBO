public class kalkulator {
    public static void main(String[] args) {
        int angka1, angka2, total;
        String tambah, kurang, kali, bagi;

        angka1 = 10;
        angka2 = 15;
        tambah = "+";
        kurang = "-";
        kali = "*";
        bagi = "/";

        total = Tambah(angka1, angka2);
        System.out.println(angka1 + tambah + angka2 + "=" + total);
        total = Kurang(angka1, angka2);
        System.out.println(angka1 + kurang + angka2 + "=" + total);
        total = PerKali(angka1, angka2);
        System.out.println(angka1 + kali + angka2 + "=" + total);
        total = Bagi(angka1, angka2);
        System.out.println(angka1 + bagi + angka2 + "=" + total);

    }

    public static int Tambah(int angka1, int angka2){
        angka1 += angka2;
        return angka1;
    }

    public static int Kurang(int angka1, int angka2){
        angka1 -= angka2;
        return angka1;
    }

    public static int PerKali(int angka1, int angka2){
        angka1 *= angka2;
        return angka1;
    }

    public static int Bagi(int angka1, int angka2){
        angka1 /= angka2;
        return angka1;
    }
}
